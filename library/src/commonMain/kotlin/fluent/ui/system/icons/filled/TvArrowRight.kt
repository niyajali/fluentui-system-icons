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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TvArrowRight Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a television.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tv_arrow_right_20_filled.svg)
 * 
 * @return The [ImageVector] for the TvArrowRight icon.
 */
public val FluentIcons.Filled.TvArrowRight: ImageVector
    get() {
        if (_tvArrowRight != null) {
            return _tvArrowRight!!
        }
        _tvArrowRight = Builder(name = "TvArrowRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.5f)
                curveTo(19.0f, 7.985f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 7.985f, 10.0f, 5.5f)
                curveTo(10.0f, 3.015f, 12.015f, 1.0f, 14.5f, 1.0f)
                curveTo(16.985f, 1.0f, 19.0f, 3.015f, 19.0f, 5.5f)
                close()
                moveTo(16.853f, 5.854f)
                lineTo(16.856f, 5.851f)
                curveTo(16.903f, 5.804f, 16.938f, 5.749f, 16.962f, 5.691f)
                curveTo(16.986f, 5.633f, 17.0f, 5.57f, 17.0f, 5.503f)
                lineTo(17.0f, 5.5f)
                lineTo(17.0f, 5.497f)
                curveTo(17.0f, 5.43f, 16.986f, 5.367f, 16.962f, 5.309f)
                curveTo(16.938f, 5.25f, 16.902f, 5.194f, 16.854f, 5.146f)
                lineTo(14.854f, 3.146f)
                curveTo(14.658f, 2.951f, 14.342f, 2.951f, 14.146f, 3.146f)
                curveTo(13.951f, 3.342f, 13.951f, 3.658f, 14.146f, 3.854f)
                lineTo(15.293f, 5.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 5.0f, 12.0f, 5.224f, 12.0f, 5.5f)
                curveTo(12.0f, 5.776f, 12.224f, 6.0f, 12.5f, 6.0f)
                lineTo(15.293f, 6.0f)
                lineTo(14.146f, 7.146f)
                curveTo(13.951f, 7.342f, 13.951f, 7.658f, 14.146f, 7.854f)
                curveTo(14.342f, 8.049f, 14.658f, 8.049f, 14.854f, 7.854f)
                lineTo(16.853f, 5.854f)
                close()
                moveTo(14.5f, 11.0f)
                curveTo(15.83f, 11.0f, 17.049f, 10.528f, 18.0f, 9.743f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 14.105f, 17.105f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 15.0f, 2.0f, 14.105f, 2.0f, 13.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(9.207f)
                curveTo(9.072f, 4.477f, 9.0f, 4.98f, 9.0f, 5.5f)
                curveTo(9.0f, 8.538f, 11.462f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(5.5f, 16.0f)
                curveTo(5.224f, 16.0f, 5.0f, 16.224f, 5.0f, 16.5f)
                curveTo(5.0f, 16.776f, 5.224f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 17.0f, 15.0f, 16.776f, 15.0f, 16.5f)
                curveTo(15.0f, 16.224f, 14.776f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _tvArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _tvArrowRight: ImageVector? = null

@Preview
@Composable
private fun TvArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TvArrowRight, contentDescription = "TvArrowRight Icon")
    }
}

