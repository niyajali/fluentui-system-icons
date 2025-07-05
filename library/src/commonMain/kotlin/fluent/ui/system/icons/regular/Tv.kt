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
 * Tv Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a television.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tv_24_regular.svg)
 * 
 * @return The [ImageVector] for the Tv icon.
 */
public val FluentIcons.Regular.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.75f, 4.0f)
                curveTo(3.231f, 4.0f, 2.0f, 5.231f, 2.0f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 16.769f, 3.231f, 18.0f, 4.75f, 18.0f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 18.0f, 22.0f, 16.769f, 22.0f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 5.231f, 20.769f, 4.0f, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(20.5f, 15.94f, 19.94f, 16.5f, 19.25f, 16.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 16.5f, 3.5f, 15.94f, 3.5f, 15.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(5.75f, 19.5f)
                curveTo(5.336f, 19.5f, 5.0f, 19.836f, 5.0f, 20.25f)
                curveTo(5.0f, 20.664f, 5.336f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 21.0f, 19.0f, 20.664f, 19.0f, 20.25f)
                curveTo(19.0f, 19.836f, 18.664f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _tv!!
    }

@Suppress("ObjectPropertyName")
private var _tv: ImageVector? = null

@Preview
@Composable
private fun TvPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Tv, contentDescription = "Tv Icon")
    }
}

