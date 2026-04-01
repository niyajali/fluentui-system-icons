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
 * HeadphonesMonoaural Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent headphone device audio.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_headphones_monoaural_20_regular.svg)
 * 
 * @return The [ImageVector] for the HeadphonesMonoaural icon.
 */
public val FluentIcons.Regular.HeadphonesMonoaural: ImageVector
    get() {
        if (_headphonesMonoaural != null) {
            return _headphonesMonoaural!!
        }
        _headphonesMonoaural = Builder(name = "HeadphonesMonoaural", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.002f, 2.0f)
                curveTo(14.42f, 2.0f, 18.002f, 5.582f, 18.002f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(18.002f, 11.007f, 18.0f, 11.013f, 18.0f, 11.019f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.105f, 17.104f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 18.0f, 13.0f, 17.776f, 13.0f, 17.5f)
                verticalLineTo(11.5f)
                curveTo(13.0f, 11.224f, 13.224f, 11.0f, 13.5f, 11.0f)
                horizontalLineTo(17.0f)
                lineTo(17.002f, 10.0f)
                curveTo(17.002f, 6.134f, 13.868f, 3.0f, 10.002f, 3.0f)
                curveTo(6.626f, 3.0f, 3.811f, 5.39f, 3.15f, 8.569f)
                curveTo(3.099f, 8.815f, 2.888f, 9.0f, 2.637f, 9.0f)
                curveTo(2.334f, 9.0f, 2.099f, 8.734f, 2.158f, 8.437f)
                curveTo(2.885f, 4.767f, 6.119f, 2.0f, 10.002f, 2.0f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 17.0f, 17.0f, 16.552f, 17.0f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _headphonesMonoaural!!
    }

@Suppress("ObjectPropertyName")
private var _headphonesMonoaural: ImageVector? = null

@Preview
@Composable
private fun HeadphonesMonoauralPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HeadphonesMonoaural, contentDescription = "HeadphonesMonoaural Icon")
    }
}

