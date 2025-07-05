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
 * WindowWrench Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_wrench_24_regular.svg)
 * 
 * @return The [ImageVector] for the WindowWrench icon.
 */
public val FluentIcons.Regular.WindowWrench: ImageVector
    get() {
        if (_windowWrench != null) {
            return _windowWrench!!
        }
        _windowWrench = Builder(name = "WindowWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(11.908f)
                curveTo(20.826f, 11.529f, 20.482f, 11.219f, 20.012f, 11.117f)
                curveTo(19.843f, 11.08f, 19.672f, 11.052f, 19.5f, 11.032f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.926f)
                lineTo(11.74f, 19.686f)
                curveTo(11.368f, 20.058f, 11.136f, 20.518f, 11.044f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.5f, 6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.075f, 21.0f)
                curveTo(12.147f, 20.778f, 12.271f, 20.569f, 12.447f, 20.393f)
                lineTo(15.176f, 17.663f)
                curveTo(14.548f, 16.181f, 14.838f, 14.401f, 16.047f, 13.193f)
                curveTo(16.988f, 12.252f, 18.276f, 11.867f, 19.5f, 12.04f)
                curveTo(19.6f, 12.054f, 19.7f, 12.072f, 19.799f, 12.094f)
                curveTo(20.014f, 12.141f, 20.131f, 12.32f, 20.131f, 12.51f)
                curveTo(20.13f, 12.631f, 20.083f, 12.757f, 19.984f, 12.856f)
                lineTo(18.08f, 14.76f)
                curveTo(17.483f, 15.357f, 17.483f, 16.324f, 18.08f, 16.92f)
                curveTo(18.465f, 17.306f, 19.005f, 17.442f, 19.5f, 17.329f)
                curveTo(19.735f, 17.276f, 19.96f, 17.166f, 20.153f, 17.0f)
                curveTo(20.183f, 16.975f, 20.211f, 16.948f, 20.239f, 16.92f)
                lineTo(22.144f, 15.016f)
                curveTo(22.399f, 14.761f, 22.829f, 14.848f, 22.906f, 15.201f)
                curveTo(23.192f, 16.511f, 22.826f, 17.934f, 21.807f, 18.952f)
                curveTo(20.598f, 20.161f, 18.819f, 20.451f, 17.337f, 19.823f)
                lineTo(14.607f, 22.553f)
                curveTo(14.011f, 23.149f, 13.044f, 23.149f, 12.447f, 22.553f)
                curveTo(12.027f, 22.133f, 11.903f, 21.529f, 12.075f, 21.0f)
                close()
                moveTo(17.574f, 21.0f)
                horizontalLineTo(17.72f)
                curveTo(17.681f, 20.99f, 17.643f, 20.98f, 17.604f, 20.97f)
                lineTo(17.574f, 21.0f)
                close()
            }
        }
        .build()
        return _windowWrench!!
    }

@Suppress("ObjectPropertyName")
private var _windowWrench: ImageVector? = null

@Preview
@Composable
private fun WindowWrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowWrench, contentDescription = "WindowWrench Icon")
    }
}

