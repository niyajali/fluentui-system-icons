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
 * TagCircle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: tag, circle
 * - Source: ic_fluent_tag_circle_20_regular.svg
 * 
 * @return The [ImageVector] for the TagCircle icon.
 */
public val FluentIcons.Regular.TagCircle: ImageVector
    get() {
        if (_tagCircle != null) {
            return _tagCircle!!
        }
        _tagCircle = Builder(name = "TagCircle", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.0f)
                curveTo(6.672f, 7.0f, 6.0f, 7.672f, 6.0f, 8.5f)
                verticalLineTo(11.5f)
                curveTo(6.0f, 12.328f, 6.672f, 13.0f, 7.5f, 13.0f)
                horizontalLineTo(11.558f)
                curveTo(11.958f, 13.0f, 12.347f, 12.863f, 12.658f, 12.611f)
                lineTo(14.444f, 11.166f)
                curveTo(15.186f, 10.566f, 15.186f, 9.434f, 14.444f, 8.834f)
                lineTo(12.658f, 7.39f)
                curveTo(12.347f, 7.137f, 11.958f, 7.0f, 11.558f, 7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.0f, 8.5f)
                curveTo(7.0f, 8.224f, 7.224f, 8.0f, 7.5f, 8.0f)
                horizontalLineTo(11.558f)
                curveTo(11.729f, 8.0f, 11.896f, 8.059f, 12.029f, 8.167f)
                lineTo(13.815f, 9.611f)
                curveTo(14.062f, 9.811f, 14.062f, 10.189f, 13.815f, 10.389f)
                lineTo(12.029f, 11.833f)
                curveTo(11.896f, 11.941f, 11.729f, 12.0f, 11.558f, 12.0f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 12.0f, 7.0f, 11.776f, 7.0f, 11.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(5.582f, 2.0f, 2.0f, 5.582f, 2.0f, 10.0f)
                curveTo(2.0f, 14.418f, 5.582f, 18.0f, 10.0f, 18.0f)
                curveTo(14.418f, 18.0f, 18.0f, 14.418f, 18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.134f, 6.134f, 3.0f, 10.0f, 3.0f)
                curveTo(13.866f, 3.0f, 17.0f, 6.134f, 17.0f, 10.0f)
                curveTo(17.0f, 13.866f, 13.866f, 17.0f, 10.0f, 17.0f)
                curveTo(6.134f, 17.0f, 3.0f, 13.866f, 3.0f, 10.0f)
                close()
            }
        }
        .build()
        return _tagCircle!!
    }

@Suppress("ObjectPropertyName")
private var _tagCircle: ImageVector? = null

@Preview
@Composable
private fun TagCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagCircle, contentDescription = null)
    }
}

