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
 * VideoBackgroundEffectHorizontal Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in video meeting scenarios around background blurring.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_background_effect_horizontal_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoBackgroundEffectHorizontal icon.
 */
public val FluentIcons.Regular.VideoBackgroundEffectHorizontal: ImageVector
    get() {
        if (_videoBackgroundEffectHorizontal != null) {
            return _videoBackgroundEffectHorizontal!!
        }
        _videoBackgroundEffectHorizontal = Builder(name = "VideoBackgroundEffectHorizontal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.128f, 5.5f)
                curveTo(2.437f, 4.626f, 3.27f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                curveTo(20.73f, 4.0f, 21.563f, 4.626f, 21.872f, 5.5f)
                horizontalLineTo(2.128f)
                close()
                moveTo(22.0f, 11.25f)
                horizontalLineTo(15.801f)
                curveTo(15.615f, 11.816f, 15.305f, 12.327f, 14.905f, 12.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineTo(15.874f)
                curveTo(15.731f, 8.444f, 15.471f, 7.935f, 15.123f, 7.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(14.829f, 9.0f)
                curveTo(14.611f, 8.382f, 14.196f, 7.857f, 13.659f, 7.5f)
                curveTo(13.184f, 7.184f, 12.613f, 7.0f, 12.0f, 7.0f)
                curveTo(11.387f, 7.0f, 10.816f, 7.184f, 10.341f, 7.5f)
                curveTo(9.804f, 7.857f, 9.389f, 8.382f, 9.171f, 9.0f)
                curveTo(9.06f, 9.313f, 9.0f, 9.649f, 9.0f, 10.0f)
                curveTo(9.0f, 10.446f, 9.097f, 10.87f, 9.272f, 11.25f)
                curveTo(9.579f, 11.918f, 10.124f, 12.455f, 10.799f, 12.75f)
                curveTo(11.167f, 12.911f, 11.573f, 13.0f, 12.0f, 13.0f)
                curveTo(12.427f, 13.0f, 12.833f, 12.911f, 13.201f, 12.75f)
                curveTo(13.876f, 12.455f, 14.421f, 11.918f, 14.728f, 11.25f)
                curveTo(14.903f, 10.87f, 15.0f, 10.446f, 15.0f, 10.0f)
                curveTo(15.0f, 9.649f, 14.94f, 9.313f, 14.829f, 9.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(10.5f, 9.172f, 11.172f, 8.5f, 12.0f, 8.5f)
                curveTo(12.828f, 8.5f, 13.5f, 9.172f, 13.5f, 10.0f)
                curveTo(13.5f, 10.828f, 12.828f, 11.5f, 12.0f, 11.5f)
                curveTo(11.172f, 11.5f, 10.5f, 10.828f, 10.5f, 10.0f)
                close()
                moveTo(2.0f, 7.5f)
                horizontalLineTo(8.877f)
                curveTo(8.529f, 7.935f, 8.269f, 8.444f, 8.126f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(2.0f, 11.25f)
                horizontalLineTo(8.199f)
                curveTo(8.385f, 11.816f, 8.695f, 12.327f, 9.095f, 12.75f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(6.104f)
                curveTo(6.036f, 15.238f, 6.0f, 15.49f, 6.0f, 15.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(2.128f, 18.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.27f, 20.0f, 2.437f, 19.374f, 2.128f, 18.5f)
                close()
                moveTo(7.0f, 15.75f)
                curveTo(7.0f, 15.482f, 7.06f, 15.227f, 7.168f, 15.0f)
                curveTo(7.449f, 14.409f, 8.052f, 14.0f, 8.75f, 14.0f)
                horizontalLineTo(15.25f)
                curveTo(15.948f, 14.0f, 16.551f, 14.409f, 16.832f, 15.0f)
                curveTo(16.94f, 15.227f, 17.0f, 15.482f, 17.0f, 15.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(15.75f)
                curveTo(15.5f, 15.612f, 15.388f, 15.5f, 15.25f, 15.5f)
                horizontalLineTo(8.75f)
                curveTo(8.612f, 15.5f, 8.5f, 15.612f, 8.5f, 15.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.75f)
                close()
                moveTo(18.0f, 18.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.75f)
                curveTo(20.73f, 20.0f, 21.563f, 19.374f, 21.872f, 18.5f)
                horizontalLineTo(18.0f)
                close()
                moveTo(22.0f, 16.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.75f)
                curveTo(18.0f, 15.49f, 17.964f, 15.238f, 17.896f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _videoBackgroundEffectHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _videoBackgroundEffectHorizontal: ImageVector? = null

@Preview
@Composable
private fun VideoBackgroundEffectHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoBackgroundEffectHorizontal, contentDescription = "VideoBackgroundEffectHorizontal Icon")
    }
}

