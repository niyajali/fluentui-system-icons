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
 * VideoSecurity Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_security_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoSecurity icon.
 */
public val FluentIcons.Regular.VideoSecurity: ImageVector
    get() {
        if (_videoSecurity != null) {
            return _videoSecurity!!
        }
        _videoSecurity = Builder(name = "VideoSecurity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 3.0f)
                curveTo(3.455f, 3.0f, 2.0f, 4.455f, 2.0f, 6.25f)
                verticalLineTo(12.75f)
                curveTo(2.0f, 14.545f, 3.455f, 16.0f, 5.25f, 16.0f)
                horizontalLineTo(7.493f)
                curveTo(7.414f, 16.841f, 6.706f, 17.5f, 5.844f, 17.5f)
                horizontalLineTo(3.25f)
                curveTo(2.836f, 17.5f, 2.5f, 17.836f, 2.5f, 18.25f)
                verticalLineTo(21.25f)
                curveTo(2.5f, 21.664f, 2.836f, 22.0f, 3.25f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(9.426f, 22.0f, 12.0f, 19.426f, 12.0f, 16.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.75f)
                curveTo(15.439f, 16.0f, 16.826f, 14.712f, 16.985f, 13.066f)
                lineTo(20.864f, 15.393f)
                curveTo(21.096f, 15.532f, 21.384f, 15.536f, 21.619f, 15.403f)
                curveTo(21.855f, 15.269f, 22.0f, 15.02f, 22.0f, 14.75f)
                verticalLineTo(4.25f)
                curveTo(22.0f, 3.98f, 21.855f, 3.73f, 21.619f, 3.597f)
                curveTo(21.384f, 3.464f, 21.096f, 3.468f, 20.864f, 3.607f)
                lineTo(16.985f, 5.934f)
                curveTo(16.826f, 4.288f, 15.439f, 3.0f, 13.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(17.0f, 7.675f)
                lineTo(20.5f, 5.575f)
                verticalLineTo(13.425f)
                lineTo(17.0f, 11.325f)
                verticalLineTo(7.675f)
                close()
                moveTo(6.25f, 20.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.844f)
                curveTo(7.535f, 19.0f, 8.915f, 17.671f, 8.996f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(16.25f)
                curveTo(10.5f, 18.597f, 8.597f, 20.5f, 6.25f, 20.5f)
                close()
                moveTo(3.5f, 6.25f)
                curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(14.717f, 4.5f, 15.5f, 5.284f, 15.5f, 6.25f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 13.717f, 14.717f, 14.5f, 13.75f, 14.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 14.5f, 3.5f, 13.717f, 3.5f, 12.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _videoSecurity!!
    }

@Suppress("ObjectPropertyName")
private var _videoSecurity: ImageVector? = null

@Preview
@Composable
private fun VideoSecurityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoSecurity, contentDescription = "VideoSecurity Icon")
    }
}

