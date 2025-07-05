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
 * TrophyLock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent an un-lockable rewards, top award, or celebration events.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_trophy_lock_24_regular.svg)
 * 
 * @return The [ImageVector] for the TrophyLock icon.
 */
public val FluentIcons.Regular.TrophyLock: ImageVector
    get() {
        if (_trophyLock != null) {
            return _trophyLock!!
        }
        _trophyLock = Builder(name = "TrophyLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.49f, 4.0f)
                curveTo(17.366f, 2.875f, 16.412f, 2.0f, 15.254f, 2.0f)
                horizontalLineTo(8.251f)
                curveTo(7.092f, 2.0f, 6.138f, 2.875f, 6.014f, 4.0f)
                lineTo(4.746f, 4.0f)
                curveTo(3.78f, 4.0f, 2.996f, 4.784f, 2.996f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(2.996f, 10.545f, 4.451f, 12.0f, 6.246f, 12.0f)
                lineTo(6.272f, 12.001f)
                curveTo(6.94f, 14.09f, 8.769f, 15.66f, 11.0f, 15.951f)
                lineTo(11.0f, 17.5f)
                horizontalLineTo(9.251f)
                lineTo(9.066f, 17.505f)
                curveTo(7.357f, 17.601f, 6.001f, 19.017f, 6.001f, 20.75f)
                verticalLineTo(21.25f)
                lineTo(6.007f, 21.352f)
                curveTo(6.057f, 21.718f, 6.371f, 22.0f, 6.751f, 22.0f)
                horizontalLineTo(13.5f)
                curveTo(13.186f, 21.582f, 13.0f, 21.063f, 13.0f, 20.5f)
                horizontalLineTo(7.518f)
                lineTo(7.546f, 20.353f)
                curveTo(7.726f, 19.577f, 8.421f, 19.0f, 9.251f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.5f)
                lineTo(12.501f, 15.952f)
                curveTo(12.67f, 15.93f, 12.836f, 15.901f, 13.0f, 15.864f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 15.015f, 13.138f, 14.562f, 13.378f, 14.178f)
                curveTo(12.877f, 14.386f, 12.328f, 14.5f, 11.752f, 14.5f)
                curveTo(9.404f, 14.5f, 7.501f, 12.597f, 7.501f, 10.248f)
                verticalLineTo(4.25f)
                curveTo(7.501f, 3.836f, 7.836f, 3.5f, 8.251f, 3.5f)
                horizontalLineTo(15.254f)
                curveTo(15.668f, 3.5f, 16.004f, 3.836f, 16.004f, 4.25f)
                verticalLineTo(10.248f)
                curveTo(16.004f, 10.353f, 16.0f, 10.456f, 15.993f, 10.558f)
                curveTo(16.404f, 10.135f, 16.922f, 9.816f, 17.504f, 9.644f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.758f)
                lineTo(18.815f, 5.507f)
                curveTo(18.925f, 5.533f, 19.008f, 5.632f, 19.008f, 5.75f)
                verticalLineTo(8.75f)
                lineTo(19.001f, 8.904f)
                curveTo(18.982f, 9.122f, 18.923f, 9.328f, 18.832f, 9.516f)
                curveTo(19.352f, 9.564f, 19.839f, 9.727f, 20.267f, 9.978f)
                curveTo(20.422f, 9.599f, 20.508f, 9.185f, 20.508f, 8.75f)
                verticalLineTo(5.75f)
                lineTo(20.502f, 5.606f)
                curveTo(20.429f, 4.707f, 19.676f, 4.0f, 18.758f, 4.0f)
                lineTo(17.49f, 4.0f)
                close()
                moveTo(4.746f, 5.5f)
                horizontalLineTo(6.001f)
                verticalLineTo(10.483f)
                curveTo(5.15f, 10.363f, 4.496f, 9.633f, 4.496f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(4.496f, 5.612f, 4.608f, 5.5f, 4.746f, 5.5f)
                close()
                moveTo(18.5f, 10.5f)
                curveTo(17.119f, 10.5f, 16.0f, 11.619f, 16.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.5f)
                curveTo(14.672f, 14.0f, 14.0f, 14.672f, 14.0f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(14.0f, 21.328f, 14.672f, 22.0f, 15.5f, 22.0f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 22.0f, 23.0f, 21.328f, 23.0f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(23.0f, 14.672f, 22.328f, 14.0f, 21.5f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 11.619f, 19.881f, 10.5f, 18.5f, 10.5f)
                close()
                moveTo(18.5f, 12.0f)
                curveTo(19.052f, 12.0f, 19.5f, 12.448f, 19.5f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.0f)
                curveTo(17.5f, 12.448f, 17.948f, 12.0f, 18.5f, 12.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(17.948f, 19.0f, 17.5f, 18.552f, 17.5f, 18.0f)
                curveTo(17.5f, 17.448f, 17.948f, 17.0f, 18.5f, 17.0f)
                curveTo(19.052f, 17.0f, 19.5f, 17.448f, 19.5f, 18.0f)
                curveTo(19.5f, 18.552f, 19.052f, 19.0f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _trophyLock!!
    }

@Suppress("ObjectPropertyName")
private var _trophyLock: ImageVector? = null

@Preview
@Composable
private fun TrophyLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TrophyLock, contentDescription = "TrophyLock Icon")
    }
}

