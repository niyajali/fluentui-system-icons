/*
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
package fluent.ui.system.icons.regular

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
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.HeartOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            moveTo(15.213f, 16.274f)
            lineTo(12f, 19.485f)
            lineTo(4.635f, 12.12f)
            curveTo(3.122f, 10.606f, 3.122f, 8.153f, 4.635f, 6.64f)
            curveTo(4.796f, 6.479f, 4.967f, 6.335f, 5.147f, 6.208f)
            lineTo(15.213f, 16.274f)
            close()
            moveTo(19.368f, 12.121f)
            lineTo(17.335f, 14.153f)
            lineTo(18.396f, 15.214f)
            lineTo(20.432f, 13.179f)
            curveTo(22.526f, 11.073f, 22.53f, 7.679f, 20.43f, 5.58f)
            curveTo(18.327f, 3.477f, 14.923f, 3.477f, 12.82f, 5.58f)
            lineTo(11.999f, 6.402f)
            lineTo(11.176f, 5.579f)
            curveTo(10.079f, 4.482f, 8.626f, 3.959f, 7.19f, 4.008f)
            lineTo(9.081f, 5.899f)
            curveTo(9.455f, 6.082f, 9.805f, 6.329f, 10.115f, 6.64f)
            lineTo(11.472f, 7.997f)
            curveTo(11.77f, 8.295f, 12.255f, 8.289f, 12.546f, 7.984f)
            lineTo(13.88f, 6.64f)
            curveTo(15.397f, 5.123f, 17.853f, 5.123f, 19.37f, 6.64f)
            curveTo(20.883f, 8.154f, 20.881f, 10.6f, 19.368f, 12.121f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HeartOff, contentDescription = null)
    }
}
