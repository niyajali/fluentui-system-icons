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
 * SyncOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in scenarios where data syncing has stopped.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sync_off_20_filled.svg)
 * 
 * @return The [ImageVector] for the SyncOff icon.
 */
public val FluentIcons.Filled.SyncOff: ImageVector
    get() {
        if (_syncOff != null) {
            return _syncOff!!
        }
        _syncOff = Builder(name = "SyncOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.938f, 9.0f)
                horizontalLineTo(12.306f)
                lineTo(12.981f, 6.637f)
                curveTo(13.057f, 6.372f, 12.903f, 6.095f, 12.637f, 6.019f)
                curveTo(12.372f, 5.944f, 12.095f, 6.097f, 12.019f, 6.363f)
                lineTo(10.019f, 13.363f)
                curveTo(9.943f, 13.628f, 10.097f, 13.905f, 10.363f, 13.981f)
                curveTo(10.628f, 14.057f, 10.905f, 13.903f, 10.981f, 13.637f)
                lineTo(12.02f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 14.418f, 14.418f, 18.0f, 10.0f, 18.0f)
                curveTo(5.582f, 18.0f, 2.0f, 14.418f, 2.0f, 10.0f)
                horizontalLineTo(7.98f)
                lineTo(7.019f, 13.363f)
                curveTo(6.943f, 13.628f, 7.097f, 13.905f, 7.363f, 13.981f)
                curveTo(7.628f, 14.057f, 7.905f, 13.903f, 7.981f, 13.637f)
                lineTo(9.981f, 6.637f)
                curveTo(10.057f, 6.372f, 9.903f, 6.095f, 9.637f, 6.019f)
                curveTo(9.372f, 5.944f, 9.095f, 6.097f, 9.019f, 6.363f)
                lineTo(8.266f, 9.0f)
                horizontalLineTo(2.062f)
                curveTo(2.554f, 5.054f, 5.92f, 2.0f, 10.0f, 2.0f)
                curveTo(14.08f, 2.0f, 17.446f, 5.054f, 17.938f, 9.0f)
                close()
            }
        }
        .build()
        return _syncOff!!
    }

@Suppress("ObjectPropertyName")
private var _syncOff: ImageVector? = null

@Preview
@Composable
private fun SyncOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SyncOff, contentDescription = "SyncOff Icon")
    }
}

