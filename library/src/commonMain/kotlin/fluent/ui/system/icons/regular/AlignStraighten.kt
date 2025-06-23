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

public val FluentIcons.Regular.AlignStraighten: ImageVector
    get() {
        if (_AlignStraighten != null) {
            return _AlignStraighten!!
        }
        _AlignStraighten = ImageVector.Builder(
            name = "Regular.AlignStraighten",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.078f, 9.04f)
                curveTo(2.689f, 7.288f, 3.795f, 5.552f, 5.547f, 5.164f)
                lineTo(14.961f, 3.077f)
                curveTo(16.713f, 2.688f, 18.449f, 3.794f, 18.837f, 5.546f)
                lineTo(19.88f, 10.25f)
                horizontalLineTo(18.344f)
                lineTo(17.373f, 5.871f)
                curveTo(17.163f, 4.927f, 16.229f, 4.332f, 15.285f, 4.541f)
                lineTo(5.872f, 6.628f)
                curveTo(4.928f, 6.837f, 4.333f, 7.772f, 4.542f, 8.715f)
                lineTo(4.882f, 10.25f)
                horizontalLineTo(3.346f)
                lineTo(3.078f, 9.04f)
                close()
                moveTo(19.119f, 13.75f)
                horizontalLineTo(20.656f)
                lineTo(20.924f, 14.96f)
                curveTo(21.313f, 16.712f, 20.207f, 18.448f, 18.455f, 18.836f)
                lineTo(9.041f, 20.923f)
                curveTo(7.289f, 21.312f, 5.553f, 20.206f, 5.165f, 18.454f)
                lineTo(4.122f, 13.75f)
                horizontalLineTo(5.658f)
                lineTo(6.629f, 18.129f)
                curveTo(6.838f, 19.072f, 7.773f, 19.668f, 8.716f, 19.459f)
                lineTo(18.13f, 17.372f)
                curveTo(19.073f, 17.163f, 19.669f, 16.228f, 19.46f, 15.284f)
                lineTo(19.119f, 13.75f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 11.586f, 1.336f, 11.25f, 1.75f, 11.25f)
                horizontalLineTo(4.25f)
                curveTo(4.664f, 11.25f, 5f, 11.586f, 5f, 12f)
                curveTo(5f, 12.414f, 4.664f, 12.75f, 4.25f, 12.75f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 12.75f, 1f, 12.414f, 1f, 12f)
                close()
                moveTo(7f, 12f)
                curveTo(7f, 11.586f, 7.336f, 11.25f, 7.75f, 11.25f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 11.25f, 11f, 11.586f, 11f, 12f)
                curveTo(11f, 12.414f, 10.664f, 12.75f, 10.25f, 12.75f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 12.75f, 7f, 12.414f, 7f, 12f)
                close()
                moveTo(13.75f, 11.25f)
                curveTo(13.336f, 11.25f, 13f, 11.586f, 13f, 12f)
                curveTo(13f, 12.414f, 13.336f, 12.75f, 13.75f, 12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
                horizontalLineTo(13.75f)
                close()
                moveTo(19f, 12f)
                curveTo(19f, 11.586f, 19.336f, 11.25f, 19.75f, 11.25f)
                horizontalLineTo(22.25f)
                curveTo(22.664f, 11.25f, 23f, 11.586f, 23f, 12f)
                curveTo(23f, 12.414f, 22.664f, 12.75f, 22.25f, 12.75f)
                horizontalLineTo(19.75f)
                curveTo(19.336f, 12.75f, 19f, 12.414f, 19f, 12f)
                close()
            }
        }.build()

        return _AlignStraighten!!
    }

@Suppress("ObjectPropertyName")
private var _AlignStraighten: ImageVector? = null

@Preview
@Composable
private fun AlignStraightenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignStraighten, contentDescription = null)
    }
}
