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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.MultiselectLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MultiselectLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.78f, 4.78f)
            curveTo(7.073f, 4.487f, 7.073f, 4.013f, 6.78f, 3.72f)
            curveTo(6.487f, 3.427f, 6.013f, 3.427f, 5.72f, 3.72f)
            lineTo(3.75f, 5.689f)
            lineTo(3.28f, 5.22f)
            curveTo(2.987f, 4.927f, 2.513f, 4.927f, 2.22f, 5.22f)
            curveTo(1.927f, 5.513f, 1.927f, 5.987f, 2.22f, 6.28f)
            lineTo(3.22f, 7.28f)
            curveTo(3.513f, 7.573f, 3.987f, 7.573f, 4.28f, 7.28f)
            lineTo(6.78f, 4.78f)
            close()
            moveTo(9.75f, 18.007f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 18.007f, 22f, 18.343f, 22f, 18.757f)
            curveTo(22f, 19.136f, 21.718f, 19.45f, 21.352f, 19.5f)
            lineTo(21.25f, 19.507f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 19.507f, 9f, 19.171f, 9f, 18.757f)
            curveTo(9f, 18.377f, 9.282f, 18.063f, 9.648f, 18.014f)
            lineTo(9.75f, 18.007f)
            close()
            moveTo(9.75f, 11.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11.5f, 22f, 11.836f, 22f, 12.25f)
            curveTo(22f, 12.63f, 21.718f, 12.943f, 21.352f, 12.993f)
            lineTo(21.25f, 13f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 13f, 9f, 12.664f, 9f, 12.25f)
            curveTo(9f, 11.87f, 9.282f, 11.557f, 9.648f, 11.507f)
            lineTo(9.75f, 11.5f)
            close()
            moveTo(9.75f, 5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
            curveTo(22f, 6.13f, 21.718f, 6.443f, 21.352f, 6.493f)
            lineTo(21.25f, 6.5f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 6.5f, 9f, 6.164f, 9f, 5.75f)
            curveTo(9f, 5.37f, 9.282f, 5.057f, 9.648f, 5.007f)
            lineTo(9.75f, 5f)
            close()
            moveTo(6.78f, 16.72f)
            curveTo(7.073f, 17.013f, 7.073f, 17.487f, 6.78f, 17.78f)
            lineTo(4.28f, 20.28f)
            curveTo(3.987f, 20.573f, 3.513f, 20.573f, 3.22f, 20.28f)
            lineTo(2.22f, 19.28f)
            curveTo(1.927f, 18.987f, 1.927f, 18.513f, 2.22f, 18.22f)
            curveTo(2.513f, 17.927f, 2.987f, 17.927f, 3.28f, 18.22f)
            lineTo(3.75f, 18.689f)
            lineTo(5.72f, 16.72f)
            curveTo(6.013f, 16.427f, 6.487f, 16.427f, 6.78f, 16.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MultiselectLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MultiselectLtr, contentDescription = null)
    }
}
