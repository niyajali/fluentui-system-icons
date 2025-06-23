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

public val FluentIcons.Regular.DualScreenTablet: ImageVector
    get() {
        if (_DualScreenTablet != null) {
            return _DualScreenTablet!!
        }
        _DualScreenTablet = ImageVector.Builder(
            name = "Regular.DualScreenTablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.25f, 9f)
                curveTo(13.168f, 9f, 13.921f, 9.707f, 13.994f, 10.606f)
                lineTo(14f, 10.75f)
                verticalLineTo(19.25f)
                curveTo(14f, 20.168f, 13.293f, 20.921f, 12.394f, 20.994f)
                lineTo(12.25f, 21f)
                horizontalLineTo(3.75f)
                curveTo(2.832f, 21f, 2.079f, 20.293f, 2.006f, 19.393f)
                lineTo(2f, 19.25f)
                verticalLineTo(10.75f)
                curveTo(2f, 9.832f, 2.707f, 9.079f, 3.606f, 9.006f)
                lineTo(3.75f, 9f)
                horizontalLineTo(12.25f)
                close()
                moveTo(7.5f, 10.499f)
                lineTo(3.75f, 10.5f)
                curveTo(3.632f, 10.5f, 3.533f, 10.582f, 3.507f, 10.693f)
                lineTo(3.5f, 10.75f)
                verticalLineTo(19.25f)
                curveTo(3.5f, 19.368f, 3.582f, 19.468f, 3.693f, 19.493f)
                lineTo(3.75f, 19.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.499f)
                close()
                moveTo(12.25f, 10.5f)
                lineTo(8.5f, 10.499f)
                verticalLineTo(19.5f)
                horizontalLineTo(12.25f)
                curveTo(12.368f, 19.5f, 12.467f, 19.418f, 12.493f, 19.307f)
                lineTo(12.5f, 19.25f)
                verticalLineTo(10.75f)
                curveTo(12.5f, 10.632f, 12.418f, 10.532f, 12.307f, 10.506f)
                lineTo(12.25f, 10.5f)
                close()
                moveTo(10.625f, 17f)
                curveTo(11.039f, 17f, 11.375f, 17.336f, 11.375f, 17.75f)
                curveTo(11.375f, 18.13f, 11.093f, 18.444f, 10.727f, 18.493f)
                lineTo(10.625f, 18.5f)
                horizontalLineTo(10.125f)
                curveTo(9.711f, 18.5f, 9.375f, 18.164f, 9.375f, 17.75f)
                curveTo(9.375f, 17.37f, 9.657f, 17.056f, 10.023f, 17.007f)
                lineTo(10.125f, 17f)
                horizontalLineTo(10.625f)
                close()
                moveTo(5.875f, 17f)
                curveTo(6.289f, 17f, 6.625f, 17.336f, 6.625f, 17.75f)
                curveTo(6.625f, 18.13f, 6.343f, 18.444f, 5.977f, 18.493f)
                lineTo(5.875f, 18.5f)
                horizontalLineTo(5.375f)
                curveTo(4.961f, 18.5f, 4.625f, 18.164f, 4.625f, 17.75f)
                curveTo(4.625f, 17.37f, 4.907f, 17.056f, 5.273f, 17.007f)
                lineTo(5.375f, 17f)
                horizontalLineTo(5.875f)
                close()
                moveTo(19.75f, 3f)
                curveTo(20.941f, 3f, 21.916f, 3.925f, 21.995f, 5.096f)
                lineTo(22f, 5.25f)
                verticalLineTo(13.75f)
                curveTo(22f, 14.941f, 21.075f, 15.916f, 19.904f, 15.995f)
                lineTo(19.75f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(14.5f)
                horizontalLineTo(19.75f)
                curveTo(20.13f, 14.5f, 20.444f, 14.218f, 20.493f, 13.852f)
                lineTo(20.5f, 13.75f)
                verticalLineTo(5.25f)
                curveTo(20.5f, 4.836f, 20.164f, 4.5f, 19.75f, 4.5f)
                horizontalLineTo(8.25f)
                curveTo(7.87f, 4.5f, 7.557f, 4.782f, 7.507f, 5.148f)
                lineTo(7.5f, 5.25f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(5.25f)
                curveTo(6f, 4.059f, 6.925f, 3.084f, 8.096f, 3.005f)
                lineTo(8.25f, 3f)
                horizontalLineTo(19.75f)
                close()
                moveTo(16.25f, 12f)
                curveTo(16.664f, 12f, 17f, 12.336f, 17f, 12.75f)
                curveTo(17f, 13.164f, 16.664f, 13.5f, 16.25f, 13.5f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()

        return _DualScreenTablet!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenTablet: ImageVector? = null

@Preview
@Composable
private fun DualScreenTabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenTablet, contentDescription = null)
    }
}
