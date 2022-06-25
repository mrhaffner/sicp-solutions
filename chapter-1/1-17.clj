;; Exercise 1.17
;; page 60

;; perform multiplication by using halve and double  on two positive numbers
(defn double
    "Doubles a number"
    [a]
    (* a 2))

(defn halve
    "Halve a number"
    [a]
    (/ a 2))

(defn fast-*-inner
    "Multiplies two positive numbers where at least one number is even.  Operates in logarithmic time."
    [a b]
    (if   
        (= b 1) a
        (even? b) (recur (double a) (halve b))))

(defn slow-*
    "Multiplies two positive odd numbers"
    [a b]
    (if (= b 0) 0
        (+ a (slow-* a (dec b)))))

(defn fast-*
    "Multiply two positive numbers"
    [a b]
    (cond 
            (even? a) (fast-*-inner b a)
            (even? b) (fast-*-inner a b)
            :else (slow-* a b)))

