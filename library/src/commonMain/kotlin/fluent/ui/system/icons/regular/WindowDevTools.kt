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
 * WindowDevTools icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: window, dev, tools
 * - Source: ic_fluent_window_dev_tools_24_regular.svg
 * 
 * @return The [ImageVector] for the WindowDevTools icon.
 */
public val FluentIcons.Regular.WindowDevTools: ImageVector
    get() {
        if (_windowDevTools != null) {
            return _windowDevTools!!
        }
        _windowDevTools = Builder(name = "WindowDevTools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.994f, 11.933f)
                lineTo(14.28f, 10.22f)
                curveTo(13.987f, 9.927f, 13.513f, 9.927f, 13.22f, 10.22f)
                curveTo(12.927f, 10.513f, 12.927f, 10.987f, 13.22f, 11.28f)
                lineTo(14.911f, 12.972f)
                curveTo(15.042f, 12.803f, 15.185f, 12.641f, 15.34f, 12.486f)
                curveTo(15.545f, 12.28f, 15.764f, 12.096f, 15.994f, 11.933f)
                close()
                moveTo(4.5f, 7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                close()
                moveTo(10.78f, 11.28f)
                curveTo(11.073f, 10.987f, 11.073f, 10.513f, 10.78f, 10.22f)
                curveTo(10.487f, 9.927f, 10.013f, 9.927f, 9.72f, 10.22f)
                lineTo(6.72f, 13.22f)
                curveTo(6.427f, 13.513f, 6.427f, 13.987f, 6.72f, 14.28f)
                lineTo(9.72f, 17.28f)
                curveTo(10.013f, 17.573f, 10.487f, 17.573f, 10.78f, 17.28f)
                curveTo(11.073f, 16.987f, 11.073f, 16.513f, 10.78f, 16.22f)
                lineTo(8.311f, 13.75f)
                lineTo(10.78f, 11.28f)
                close()
                moveTo(19.799f, 12.094f)
                curveTo(20.152f, 12.171f, 20.239f, 12.601f, 19.984f, 12.856f)
                lineTo(18.08f, 14.76f)
                curveTo(17.483f, 15.357f, 17.483f, 16.324f, 18.08f, 16.92f)
                curveTo(18.676f, 17.517f, 19.643f, 17.517f, 20.239f, 16.92f)
                lineTo(22.144f, 15.016f)
                curveTo(22.399f, 14.761f, 22.829f, 14.848f, 22.906f, 15.201f)
                curveTo(23.192f, 16.511f, 22.826f, 17.934f, 21.807f, 18.952f)
                curveTo(20.598f, 20.161f, 18.819f, 20.451f, 17.337f, 19.823f)
                lineTo(14.607f, 22.553f)
                curveTo(14.011f, 23.149f, 13.044f, 23.149f, 12.447f, 22.553f)
                curveTo(11.851f, 21.956f, 11.851f, 20.989f, 12.447f, 20.393f)
                lineTo(15.176f, 17.663f)
                curveTo(14.548f, 16.181f, 14.838f, 14.401f, 16.047f, 13.193f)
                curveTo(17.065f, 12.175f, 18.489f, 11.808f, 19.799f, 12.094f)
                close()
            }
        }
        .build()
        return _windowDevTools!!
    }

@Suppress("ObjectPropertyName")
private var _windowDevTools: ImageVector? = null

@Preview
@Composable
private fun WindowDevToolsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowDevTools, contentDescription = null)
    }
}

