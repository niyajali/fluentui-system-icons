/**
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.HeartOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.075f, 5.136f)
            curveTo(3.901f, 5.271f, 3.734f, 5.419f, 3.574f, 5.579f)
            curveTo(1.475f, 7.678f, 1.475f, 11.081f, 3.574f, 13.18f)
            lineTo(11.47f, 21.076f)
            curveTo(11.763f, 21.368f, 12.237f, 21.368f, 12.53f, 21.076f)
            lineTo(16.274f, 17.334f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(20.432f, 13.179f)
            lineTo(18.396f, 15.214f)
            lineTo(7.19f, 4.008f)
            curveTo(8.626f, 3.959f, 10.079f, 4.482f, 11.176f, 5.579f)
            lineTo(11.999f, 6.402f)
            lineTo(12.82f, 5.58f)
            curveTo(14.923f, 3.477f, 18.327f, 3.477f, 20.43f, 5.58f)
            curveTo(22.53f, 7.679f, 22.526f, 11.073f, 20.432f, 13.179f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HeartOff, contentDescription = null)
    }
}
