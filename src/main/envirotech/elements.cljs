(ns envirotech.elements)

(defn p [& contents]
  (apply conj [:p {:class []}] contents))

;; (defn p [& contents]
;;   (vector (flatten [:p. contents])))
