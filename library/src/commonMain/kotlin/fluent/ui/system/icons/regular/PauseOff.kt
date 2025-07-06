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
 * PauseOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in playback controls. Collection includes Fastforward, Rewind, Previous, Next, Stop, Play.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_pause_off_20_regular.svg)
 * 
 * @return The [ImageVector] for the PauseOff icon.
 */
public val FluentIcons.Regular.PauseOff: ImageVector
    get() {
        if (_pauseOff != null) {
            return _pauseOff!!
        }
        _pauseOff = Builder(name = "PauseOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.707f)
                lineTo(2.146f, 2.854f)
                curveTo(1.951f, 2.658f, 1.951f, 2.342f, 2.146f, 2.146f)
                curveTo(2.342f, 1.951f, 2.658f, 1.951f, 2.854f, 2.146f)
                lineTo(17.854f, 17.146f)
                curveTo(18.049f, 17.342f, 18.049f, 17.658f, 17.854f, 17.854f)
                curveTo(17.658f, 18.049f, 17.342f, 18.049f, 17.146f, 17.854f)
                lineTo(16.697f, 17.404f)
                curveTo(16.423f, 17.766f, 15.989f, 18.0f, 15.5f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 18.0f, 12.0f, 17.328f, 12.0f, 16.5f)
                verticalLineTo(12.707f)
                lineTo(8.0f, 8.707f)
                verticalLineTo(16.5f)
                curveTo(8.0f, 17.328f, 7.328f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 18.0f, 3.0f, 17.328f, 3.0f, 16.5f)
                verticalLineTo(3.707f)
                close()
                moveTo(7.0f, 7.707f)
                lineTo(4.0f, 4.707f)
                verticalLineTo(16.5f)
                curveTo(4.0f, 16.776f, 4.224f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 17.0f, 7.0f, 16.776f, 7.0f, 16.5f)
                verticalLineTo(7.707f)
                close()
                moveTo(13.0f, 13.707f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.776f, 13.224f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(15.5f)
                curveTo(15.714f, 17.0f, 15.897f, 16.865f, 15.968f, 16.676f)
                lineTo(13.0f, 13.707f)
                close()
                moveTo(7.0f, 3.5f)
                verticalLineTo(4.879f)
                lineTo(8.0f, 5.879f)
                verticalLineTo(3.5f)
                curveTo(8.0f, 2.672f, 7.328f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(4.5f)
                curveTo(4.383f, 2.0f, 4.269f, 2.013f, 4.16f, 2.039f)
                lineTo(5.121f, 3.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 3.0f, 7.0f, 3.224f, 7.0f, 3.5f)
                close()
                moveTo(12.0f, 9.879f)
                lineTo(13.0f, 10.879f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 3.224f, 13.224f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 3.0f, 16.0f, 3.224f, 16.0f, 3.5f)
                verticalLineTo(13.879f)
                lineTo(17.0f, 14.879f)
                verticalLineTo(3.5f)
                curveTo(17.0f, 2.672f, 16.328f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 2.0f, 12.0f, 2.672f, 12.0f, 3.5f)
                verticalLineTo(9.879f)
                close()
            }
        }
        .build()
        return _pauseOff!!
    }

@Suppress("ObjectPropertyName")
private var _pauseOff: ImageVector? = null

@Preview
@Composable
private fun PauseOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PauseOff, contentDescription = "PauseOff Icon")
    }
}

