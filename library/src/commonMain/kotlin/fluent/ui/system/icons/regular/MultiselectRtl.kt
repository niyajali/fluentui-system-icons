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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MultiselectRtl: ImageVector
    get() {
        if (_MultiselectRtl != null) {
            return _MultiselectRtl!!
        }
        _MultiselectRtl = ImageVector.Builder(
            name = "Regular.MultiselectRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.78f, 4.78f)
                curveTo(22.073f, 4.487f, 22.073f, 4.013f, 21.78f, 3.72f)
                curveTo(21.487f, 3.427f, 21.013f, 3.427f, 20.72f, 3.72f)
                lineTo(18.75f, 5.689f)
                lineTo(18.28f, 5.22f)
                curveTo(17.987f, 4.927f, 17.513f, 4.927f, 17.22f, 5.22f)
                curveTo(16.927f, 5.513f, 16.927f, 5.987f, 17.22f, 6.28f)
                lineTo(18.22f, 7.28f)
                curveTo(18.513f, 7.573f, 18.987f, 7.573f, 19.28f, 7.28f)
                lineTo(21.78f, 4.78f)
                close()
                moveTo(2.75f, 18.007f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 18.007f, 15f, 18.343f, 15f, 18.757f)
                curveTo(15f, 19.136f, 14.718f, 19.45f, 14.352f, 19.5f)
                lineTo(14.25f, 19.507f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 19.507f, 2f, 19.171f, 2f, 18.757f)
                curveTo(2f, 18.377f, 2.282f, 18.063f, 2.648f, 18.014f)
                lineTo(2.75f, 18.007f)
                close()
                moveTo(2.75f, 11.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 11.5f, 15f, 11.836f, 15f, 12.25f)
                curveTo(15f, 12.63f, 14.718f, 12.943f, 14.352f, 12.993f)
                lineTo(14.25f, 13f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13f, 2f, 12.664f, 2f, 12.25f)
                curveTo(2f, 11.87f, 2.282f, 11.557f, 2.648f, 11.507f)
                lineTo(2.75f, 11.5f)
                close()
                moveTo(2.75f, 5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 5f, 15f, 5.336f, 15f, 5.75f)
                curveTo(15f, 6.13f, 14.718f, 6.443f, 14.352f, 6.493f)
                lineTo(14.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
                curveTo(2f, 5.37f, 2.282f, 5.057f, 2.648f, 5.007f)
                lineTo(2.75f, 5f)
                close()
                moveTo(21.78f, 16.72f)
                curveTo(22.073f, 17.013f, 22.073f, 17.487f, 21.78f, 17.78f)
                lineTo(19.28f, 20.28f)
                curveTo(18.987f, 20.573f, 18.513f, 20.573f, 18.22f, 20.28f)
                lineTo(17.22f, 19.28f)
                curveTo(16.927f, 18.987f, 16.927f, 18.513f, 17.22f, 18.22f)
                curveTo(17.513f, 17.927f, 17.987f, 17.927f, 18.28f, 18.22f)
                lineTo(18.75f, 18.689f)
                lineTo(20.72f, 16.72f)
                curveTo(21.013f, 16.427f, 21.487f, 16.427f, 21.78f, 16.72f)
                close()
            }
        }.build()

        return _MultiselectRtl!!
    }

@Suppress("ObjectPropertyName")
private var _MultiselectRtl: ImageVector? = null

@Preview
@Composable
private fun MultiselectRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MultiselectRtl, contentDescription = null)
    }
}
