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
 * Microwave Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a microwave.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_microwave_20_regular.svg)
 * 
 * @return The [ImageVector] for the Microwave icon.
 */
public val FluentIcons.Regular.Microwave: ImageVector
    get() {
        if (_microwave != null) {
            return _microwave!!
        }
        _microwave = Builder(name = "Microwave", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                curveTo(16.657f, 4.0f, 18.0f, 5.343f, 18.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 14.657f, 16.657f, 16.0f, 15.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 16.0f, 2.0f, 14.657f, 2.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.343f, 3.343f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveTo(3.895f, 5.0f, 3.0f, 5.895f, 3.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.105f, 3.895f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 15.0f, 17.0f, 14.105f, 17.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.895f, 16.105f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.5f, 6.0f)
                curveTo(13.328f, 6.0f, 14.0f, 6.672f, 14.0f, 7.5f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 13.328f, 13.328f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(5.5f)
                curveTo(4.723f, 14.0f, 4.085f, 13.41f, 4.008f, 12.653f)
                lineTo(4.0f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(4.0f, 6.672f, 4.672f, 6.0f, 5.5f, 6.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(5.5f, 7.0f)
                curveTo(5.224f, 7.0f, 5.0f, 7.224f, 5.0f, 7.5f)
                verticalLineTo(12.5f)
                lineTo(5.01f, 12.601f)
                curveTo(5.056f, 12.829f, 5.258f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 13.0f, 13.0f, 12.776f, 13.0f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(13.0f, 7.224f, 12.776f, 7.0f, 12.5f, 7.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(11.5f, 8.0f)
                curveTo(11.776f, 8.0f, 12.0f, 8.224f, 12.0f, 8.5f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 11.776f, 11.776f, 12.0f, 11.5f, 12.0f)
                curveTo(11.224f, 12.0f, 11.0f, 11.776f, 11.0f, 11.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 8.224f, 11.224f, 8.0f, 11.5f, 8.0f)
                close()
                moveTo(15.5f, 9.75f)
                curveTo(15.914f, 9.75f, 16.25f, 10.086f, 16.25f, 10.5f)
                curveTo(16.25f, 10.914f, 15.914f, 11.25f, 15.5f, 11.25f)
                curveTo(15.086f, 11.25f, 14.75f, 10.914f, 14.75f, 10.5f)
                curveTo(14.75f, 10.086f, 15.086f, 9.75f, 15.5f, 9.75f)
                close()
                moveTo(15.5f, 6.75f)
                curveTo(15.914f, 6.75f, 16.25f, 7.086f, 16.25f, 7.5f)
                curveTo(16.25f, 7.914f, 15.914f, 8.25f, 15.5f, 8.25f)
                curveTo(15.086f, 8.25f, 14.75f, 7.914f, 14.75f, 7.5f)
                curveTo(14.75f, 7.086f, 15.086f, 6.75f, 15.5f, 6.75f)
                close()
            }
        }
        .build()
        return _microwave!!
    }

@Suppress("ObjectPropertyName")
private var _microwave: ImageVector? = null

@Preview
@Composable
private fun MicrowavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Microwave, contentDescription = "Microwave Icon")
    }
}

