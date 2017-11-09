(ns bob
   (:require [clojure.string :as str]))

(defn response-for [tell-me]
      (cond
        (str/blank? tell-me) "Fine. Be that way!"
        (and (= tell-me 
                (str/upper-case tell-me)) 
             (not= (str/upper-case tell-me) (str/lower-case tell-me))) 
        "Whoa, chill out!"
        (str/ends-with? (str tell-me) "?") "Sure."
        :else "Whatever.")) 

