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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.AlertOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(5.224f, 6.285f)
            curveTo(4.795f, 7.185f, 4.541f, 8.185f, 4.505f, 9.241f)
            lineTo(4.5f, 9.491f)
            lineTo(4.5f, 13.503f)
            lineTo(3.085f, 16.663f)
            curveTo(2.871f, 17.142f, 3.085f, 17.704f, 3.564f, 17.919f)
            curveTo(3.686f, 17.973f, 3.818f, 18.001f, 3.952f, 18.001f)
            horizontalLineTo(16.941f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(21.002f, 17.052f)
            curveTo(21.002f, 17.268f, 20.93f, 17.467f, 20.808f, 17.626f)
            lineTo(7.051f, 3.869f)
            curveTo(8.373f, 2.707f, 10.106f, 2.004f, 12f, 2.004f)
            curveTo(16.142f, 2.004f, 19.5f, 5.362f, 19.5f, 9.504f)
            verticalLineTo(13.502f)
            lineTo(20.918f, 16.663f)
            curveTo(20.973f, 16.785f, 21.002f, 16.917f, 21.002f, 17.052f)
            close()
            moveTo(14.958f, 19.003f)
            curveTo(14.72f, 20.421f, 13.486f, 21.501f, 12f, 21.501f)
            curveTo(10.514f, 21.501f, 9.28f, 20.421f, 9.042f, 19.003f)
            horizontalLineTo(14.958f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlertOff, contentDescription = null)
    }
}
