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
 * Ram Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent short term memory in devices in a physical or metaphorical way.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_ram_20_filled.svg)
 * 
 * @return The [ImageVector] for the Ram icon.
 */
public val FluentIcons.Filled.Ram: ImageVector
    get() {
        if (_ram != null) {
            return _ram!!
        }
        _ram = Builder(name = "Ram", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.5f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(12.5f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(16.039f, 4.0f)
                curveTo(16.299f, 4.0f, 16.547f, 4.052f, 16.781f, 4.156f)
                curveTo(17.016f, 4.26f, 17.224f, 4.404f, 17.406f, 4.586f)
                curveTo(17.588f, 4.768f, 17.732f, 4.977f, 17.836f, 5.211f)
                curveTo(17.94f, 5.445f, 17.995f, 5.695f, 18.0f, 5.961f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 11.354f, 17.912f, 11.688f, 17.734f, 12.0f)
                curveTo(17.557f, 12.313f, 17.313f, 12.557f, 17.0f, 12.734f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.703f, 16.961f, 14.896f, 16.883f, 15.078f)
                curveTo(16.805f, 15.26f, 16.698f, 15.419f, 16.563f, 15.555f)
                curveTo(16.427f, 15.69f, 16.266f, 15.8f, 16.078f, 15.883f)
                curveTo(15.891f, 15.966f, 15.698f, 16.005f, 15.5f, 16.0f)
                horizontalLineTo(11.5f)
                curveTo(11.365f, 16.0f, 11.247f, 15.95f, 11.148f, 15.852f)
                lineTo(10.0f, 14.703f)
                lineTo(8.852f, 15.852f)
                curveTo(8.753f, 15.95f, 8.635f, 16.0f, 8.5f, 16.0f)
                horizontalLineTo(4.5f)
                curveTo(4.297f, 16.0f, 4.104f, 15.961f, 3.922f, 15.883f)
                curveTo(3.74f, 15.805f, 3.581f, 15.698f, 3.445f, 15.563f)
                curveTo(3.31f, 15.427f, 3.201f, 15.266f, 3.117f, 15.078f)
                curveTo(3.034f, 14.891f, 2.995f, 14.698f, 3.0f, 14.5f)
                verticalLineTo(12.734f)
                curveTo(2.693f, 12.557f, 2.451f, 12.313f, 2.273f, 12.0f)
                curveTo(2.096f, 11.688f, 2.005f, 11.354f, 2.0f, 11.0f)
                verticalLineTo(5.961f)
                curveTo(2.0f, 5.701f, 2.052f, 5.453f, 2.156f, 5.219f)
                curveTo(2.26f, 4.984f, 2.404f, 4.776f, 2.586f, 4.594f)
                curveTo(2.768f, 4.411f, 2.977f, 4.268f, 3.211f, 4.164f)
                curveTo(3.445f, 4.06f, 3.695f, 4.005f, 3.961f, 4.0f)
                horizontalLineTo(16.039f)
                close()
                moveTo(15.383f, 6.078f)
                curveTo(15.263f, 6.026f, 15.135f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.865f, 5.994f, 4.734f, 6.021f, 4.609f, 6.078f)
                curveTo(4.484f, 6.135f, 4.378f, 6.208f, 4.289f, 6.297f)
                curveTo(4.201f, 6.385f, 4.13f, 6.489f, 4.078f, 6.609f)
                curveTo(4.026f, 6.729f, 4.0f, 6.859f, 4.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(4.005f, 10.146f, 4.031f, 10.278f, 4.078f, 10.398f)
                curveTo(4.125f, 10.518f, 4.195f, 10.622f, 4.289f, 10.711f)
                curveTo(4.383f, 10.799f, 4.49f, 10.87f, 4.609f, 10.922f)
                curveTo(4.729f, 10.974f, 4.859f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.135f, 11.005f, 15.266f, 10.979f, 15.391f, 10.922f)
                curveTo(15.516f, 10.864f, 15.622f, 10.791f, 15.711f, 10.703f)
                curveTo(15.8f, 10.614f, 15.87f, 10.51f, 15.922f, 10.39f)
                curveTo(15.974f, 10.271f, 16.0f, 10.14f, 16.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 6.864f, 15.974f, 6.734f, 15.922f, 6.609f)
                curveTo(15.87f, 6.484f, 15.797f, 6.377f, 15.703f, 6.289f)
                curveTo(15.609f, 6.2f, 15.503f, 6.13f, 15.383f, 6.078f)
                close()
            }
        }
        .build()
        return _ram!!
    }

@Suppress("ObjectPropertyName")
private var _ram: ImageVector? = null

@Preview
@Composable
private fun RamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Ram, contentDescription = "Ram Icon")
    }
}

