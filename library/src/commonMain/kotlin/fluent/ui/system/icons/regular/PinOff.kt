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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PinOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PinOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(8.125f, 9.185f)
            lineTo(4.811f, 10.33f)
            curveTo(3.938f, 10.632f, 3.682f, 11.743f, 4.335f, 12.395f)
            lineTo(7.439f, 15.5f)
            lineTo(3f, 19.939f)
            lineTo(3f, 21f)
            horizontalLineTo(4.061f)
            lineTo(8.5f, 16.56f)
            lineTo(11.605f, 19.665f)
            curveTo(12.257f, 20.318f, 13.369f, 20.062f, 13.67f, 19.189f)
            lineTo(14.815f, 15.875f)
            lineTo(20.72f, 21.78f)
            curveTo(21.013f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
            curveTo(22.073f, 21.487f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(13.635f, 14.696f)
            lineTo(12.383f, 18.322f)
            lineTo(5.678f, 11.617f)
            lineTo(9.304f, 10.365f)
            lineTo(13.635f, 14.696f)
            close()
            moveTo(19.683f, 10.82f)
            lineTo(15.896f, 12.714f)
            lineTo(17.014f, 13.832f)
            lineTo(20.354f, 12.162f)
            curveTo(22.033f, 11.322f, 22.396f, 9.085f, 21.068f, 7.758f)
            lineTo(16.243f, 2.932f)
            curveTo(14.915f, 1.605f, 12.678f, 1.968f, 11.838f, 3.647f)
            lineTo(10.168f, 6.986f)
            lineTo(11.286f, 8.104f)
            lineTo(13.18f, 4.317f)
            curveTo(13.562f, 3.554f, 14.579f, 3.389f, 15.182f, 3.992f)
            lineTo(20.008f, 8.818f)
            curveTo(20.611f, 9.421f, 20.446f, 10.439f, 19.683f, 10.82f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PinOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PinOff, contentDescription = null)
    }
}
