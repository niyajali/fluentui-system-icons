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
 * VideoSwitch Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general video content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_switch_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoSwitch icon.
 */
public val FluentIcons.Regular.VideoSwitch: ImageVector
    get() {
        if (_videoSwitch != null) {
            return _videoSwitch!!
        }
        _videoSwitch = Builder(name = "VideoSwitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.75f)
                curveTo(4.0f, 4.231f, 5.231f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(13.25f)
                curveTo(14.769f, 3.0f, 16.0f, 4.231f, 16.0f, 5.75f)
                verticalLineTo(6.291f)
                lineTo(17.991f, 4.769f)
                curveTo(18.813f, 4.14f, 20.0f, 4.726f, 20.0f, 5.762f)
                verticalLineTo(12.238f)
                curveTo(20.0f, 13.274f, 18.813f, 13.86f, 17.991f, 13.231f)
                lineTo(16.0f, 11.709f)
                verticalLineTo(12.25f)
                curveTo(16.0f, 13.769f, 14.769f, 15.0f, 13.25f, 15.0f)
                horizontalLineTo(6.75f)
                curveTo(5.231f, 15.0f, 4.0f, 13.769f, 4.0f, 12.25f)
                lineTo(4.0f, 5.75f)
                close()
                moveTo(6.75f, 4.5f)
                curveTo(6.06f, 4.5f, 5.5f, 5.06f, 5.5f, 5.75f)
                lineTo(5.5f, 12.25f)
                curveTo(5.5f, 12.94f, 6.06f, 13.5f, 6.75f, 13.5f)
                horizontalLineTo(13.25f)
                curveTo(13.941f, 13.5f, 14.5f, 12.94f, 14.5f, 12.25f)
                verticalLineTo(5.75f)
                curveTo(14.5f, 5.06f, 13.941f, 4.5f, 13.25f, 4.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(16.0f, 9.821f)
                lineTo(18.5f, 11.732f)
                verticalLineTo(6.268f)
                lineTo(16.0f, 8.179f)
                verticalLineTo(9.821f)
                close()
                moveTo(18.364f, 16.138f)
                curveTo(17.413f, 15.906f, 16.233f, 15.725f, 14.905f, 15.616f)
                curveTo(15.523f, 15.311f, 16.044f, 14.842f, 16.413f, 14.266f)
                curveTo(17.26f, 14.375f, 18.037f, 14.515f, 18.718f, 14.68f)
                curveTo(19.586f, 14.891f, 20.341f, 15.154f, 20.897f, 15.474f)
                curveTo(21.397f, 15.762f, 22.0f, 16.25f, 22.0f, 17.0f)
                curveTo(22.0f, 17.47f, 21.755f, 17.839f, 21.483f, 18.099f)
                curveTo(21.212f, 18.358f, 20.854f, 18.569f, 20.466f, 18.746f)
                curveTo(19.684f, 19.1f, 18.612f, 19.385f, 17.374f, 19.593f)
                curveTo(16.965f, 19.661f, 16.579f, 19.385f, 16.51f, 18.977f)
                curveTo(16.441f, 18.569f, 16.717f, 18.182f, 17.125f, 18.113f)
                curveTo(18.304f, 17.915f, 19.232f, 17.658f, 19.846f, 17.379f)
                curveTo(20.156f, 17.239f, 20.345f, 17.111f, 20.447f, 17.014f)
                lineTo(20.455f, 17.006f)
                lineTo(20.462f, 17.0f)
                curveTo(20.415f, 16.952f, 20.324f, 16.875f, 20.149f, 16.774f)
                curveTo(19.769f, 16.556f, 19.17f, 16.334f, 18.364f, 16.138f)
                close()
                moveTo(20.509f, 16.942f)
                curveTo(20.511f, 16.94f, 20.511f, 16.939f, 20.511f, 16.939f)
                lineTo(20.509f, 16.942f)
                close()
                moveTo(3.103f, 15.474f)
                curveTo(3.411f, 15.297f, 3.779f, 15.137f, 4.194f, 14.995f)
                curveTo(4.775f, 15.535f, 5.527f, 15.894f, 6.36f, 15.98f)
                curveTo(6.107f, 16.029f, 5.865f, 16.082f, 5.637f, 16.138f)
                curveTo(4.83f, 16.334f, 4.231f, 16.556f, 3.851f, 16.774f)
                curveTo(3.675f, 16.875f, 3.584f, 16.952f, 3.538f, 17.0f)
                curveTo(3.584f, 17.048f, 3.675f, 17.125f, 3.851f, 17.226f)
                curveTo(4.231f, 17.444f, 4.83f, 17.666f, 5.637f, 17.862f)
                curveTo(7.225f, 18.249f, 9.452f, 18.496f, 11.941f, 18.5f)
                lineTo(11.222f, 17.78f)
                curveTo(10.929f, 17.487f, 10.93f, 17.012f, 11.223f, 16.719f)
                curveTo(11.516f, 16.427f, 11.991f, 16.427f, 12.284f, 16.72f)
                lineTo(14.281f, 18.72f)
                curveTo(14.573f, 19.013f, 14.573f, 19.488f, 14.28f, 19.78f)
                lineTo(12.283f, 21.777f)
                curveTo(11.99f, 22.07f, 11.516f, 22.07f, 11.223f, 21.777f)
                curveTo(10.93f, 21.485f, 10.93f, 21.01f, 11.223f, 20.717f)
                lineTo(11.939f, 20.0f)
                curveTo(9.367f, 19.996f, 7.016f, 19.741f, 5.282f, 19.32f)
                curveTo(4.414f, 19.109f, 3.659f, 18.846f, 3.103f, 18.526f)
                curveTo(2.603f, 18.238f, 2.0f, 17.75f, 2.0f, 17.0f)
                curveTo(2.0f, 16.25f, 2.603f, 15.762f, 3.103f, 15.474f)
                close()
            }
        }
        .build()
        return _videoSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _videoSwitch: ImageVector? = null

@Preview
@Composable
private fun VideoSwitchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoSwitch, contentDescription = "VideoSwitch Icon")
    }
}

