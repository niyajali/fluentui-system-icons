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
 * Whiteboard Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent brainstorming scenearios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_whiteboard_24_regular.svg)
 * 
 * @return The [ImageVector] for the Whiteboard icon.
 */
public val FluentIcons.Regular.Whiteboard: ImageVector
    get() {
        if (_whiteboard != null) {
            return _whiteboard!!
        }
        _whiteboard = Builder(name = "Whiteboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.989f, 4.0f)
                lineTo(14.486f, 5.5f)
                horizontalLineTo(5.25f)
                lineTo(5.106f, 5.506f)
                curveTo(4.207f, 5.579f, 3.5f, 6.332f, 3.5f, 7.25f)
                verticalLineTo(9.49f)
                lineTo(6.11f, 7.85f)
                curveTo(7.115f, 7.219f, 8.426f, 7.479f, 9.118f, 8.419f)
                lineTo(9.213f, 8.558f)
                curveTo(9.608f, 9.186f, 9.665f, 9.965f, 9.376f, 10.64f)
                lineTo(9.297f, 10.806f)
                lineTo(8.089f, 13.092f)
                curveTo(7.896f, 13.458f, 8.036f, 13.912f, 8.402f, 14.105f)
                curveTo(8.595f, 14.207f, 8.822f, 14.219f, 9.022f, 14.142f)
                lineTo(9.12f, 14.096f)
                lineTo(10.879f, 13.103f)
                curveTo(11.239f, 12.898f, 11.697f, 13.024f, 11.902f, 13.384f)
                curveTo(12.09f, 13.714f, 12.0f, 14.126f, 11.706f, 14.35f)
                lineTo(11.621f, 14.407f)
                lineTo(9.856f, 15.403f)
                curveTo(9.189f, 15.778f, 8.378f, 15.789f, 7.701f, 15.431f)
                curveTo(6.65f, 14.876f, 6.22f, 13.606f, 6.693f, 12.535f)
                lineTo(6.763f, 12.391f)
                lineTo(7.971f, 10.105f)
                curveTo(8.096f, 9.869f, 8.085f, 9.583f, 7.943f, 9.356f)
                curveTo(7.742f, 9.037f, 7.341f, 8.921f, 7.007f, 9.068f)
                lineTo(6.909f, 9.12f)
                lineTo(3.5f, 11.262f)
                verticalLineTo(16.755f)
                curveTo(3.5f, 17.721f, 4.284f, 18.505f, 5.25f, 18.505f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 18.505f, 20.5f, 17.721f, 20.5f, 16.755f)
                verticalLineTo(9.443f)
                lineTo(22.0f, 7.946f)
                verticalLineTo(16.755f)
                curveTo(22.0f, 18.549f, 20.545f, 20.005f, 18.75f, 20.005f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20.005f, 2.0f, 18.549f, 2.0f, 16.755f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
                lineTo(5.25f, 4.0f)
                horizontalLineTo(15.989f)
                close()
                moveTo(21.176f, 3.545f)
                lineTo(21.306f, 3.665f)
                lineTo(21.426f, 3.796f)
                curveTo(22.189f, 4.687f, 22.149f, 6.031f, 21.305f, 6.874f)
                lineTo(17.024f, 11.148f)
                curveTo(16.761f, 11.41f, 16.437f, 11.604f, 16.081f, 11.71f)
                lineTo(13.753f, 12.409f)
                curveTo(13.224f, 12.568f, 12.667f, 12.268f, 12.508f, 11.739f)
                curveTo(12.45f, 11.545f, 12.452f, 11.338f, 12.514f, 11.145f)
                lineTo(13.253f, 8.85f)
                curveTo(13.363f, 8.509f, 13.552f, 8.2f, 13.805f, 7.947f)
                lineTo(18.096f, 3.664f)
                curveTo(18.941f, 2.82f, 20.284f, 2.781f, 21.176f, 3.545f)
                close()
                moveTo(19.156f, 4.725f)
                lineTo(14.865f, 9.009f)
                curveTo(14.781f, 9.093f, 14.717f, 9.196f, 14.681f, 9.31f)
                lineTo(14.233f, 10.699f)
                lineTo(15.65f, 10.274f)
                curveTo(15.768f, 10.238f, 15.876f, 10.174f, 15.964f, 10.086f)
                lineTo(20.244f, 5.813f)
                lineTo(20.319f, 5.727f)
                curveTo(20.542f, 5.426f, 20.518f, 4.999f, 20.245f, 4.726f)
                curveTo(19.944f, 4.425f, 19.456f, 4.425f, 19.156f, 4.725f)
                close()
            }
        }
        .build()
        return _whiteboard!!
    }

@Suppress("ObjectPropertyName")
private var _whiteboard: ImageVector? = null

@Preview
@Composable
private fun WhiteboardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Whiteboard, contentDescription = "Whiteboard Icon")
    }
}

