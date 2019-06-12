(ns mylib.core
  (:require [clojure.core.match :as core.match]))


(defmacro match [& args]
  `(core.match/match ~@args))
