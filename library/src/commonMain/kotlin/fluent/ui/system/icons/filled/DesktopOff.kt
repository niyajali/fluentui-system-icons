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

public val FluentUi.Filled.DesktopOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(2.629f, 3.689f)
            curveTo(2.239f, 4.094f, 2f, 4.644f, 2f, 5.25f)
            verticalLineTo(15.752f)
            lineTo(2.005f, 15.906f)
            curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
            lineTo(8.499f, 18.002f)
            verticalLineTo(20.5f)
            lineTo(6.75f, 20.5f)
            lineTo(6.648f, 20.507f)
            curveTo(6.282f, 20.556f, 6f, 20.87f, 6f, 21.25f)
            curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
            horizontalLineTo(17.25f)
            lineTo(17.352f, 21.993f)
            curveTo(17.718f, 21.944f, 18f, 21.63f, 18f, 21.25f)
            curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
            lineTo(15.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(16.941f, 18.002f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(21.999f, 15.752f)
            curveTo(21.999f, 16.582f, 21.549f, 17.308f, 20.879f, 17.698f)
            lineTo(6.182f, 3f)
            horizontalLineTo(19.749f)
            curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
            lineTo(21.999f, 5.25f)
            verticalLineTo(15.752f)
            close()
            moveTo(13.998f, 18.002f)
            lineTo(13.999f, 20.5f)
            horizontalLineTo(9.999f)
            lineTo(9.998f, 18.002f)
            horizontalLineTo(13.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopOff, contentDescription = null)
    }
}
