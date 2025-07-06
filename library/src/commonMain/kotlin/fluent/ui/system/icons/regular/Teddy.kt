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
 * Teddy Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: 
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_teddy_24_regular.svg)
 * 
 * @return The [ImageVector] for the Teddy icon.
 */
public val FluentIcons.Regular.Teddy: ImageVector
    get() {
        if (_teddy != null) {
            return _teddy!!
        }
        _teddy = Builder(name = "Teddy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 3.875f)
                curveTo(19.778f, 3.875f, 21.625f, 5.722f, 21.625f, 8.0f)
                curveTo(21.625f, 9.247f, 21.071f, 10.365f, 20.197f, 11.121f)
                curveTo(20.475f, 11.87f, 20.625f, 12.669f, 20.625f, 13.5f)
                curveTo(20.625f, 15.89f, 19.382f, 18.019f, 17.445f, 19.414f)
                curveTo(17.162f, 19.618f, 16.865f, 19.805f, 16.555f, 19.976f)
                lineTo(16.518f, 19.996f)
                curveTo(15.204f, 20.712f, 13.656f, 21.125f, 12.0f, 21.125f)
                curveTo(10.344f, 21.125f, 8.796f, 20.712f, 7.482f, 19.996f)
                curveTo(7.174f, 19.829f, 6.88f, 19.645f, 6.6f, 19.446f)
                lineTo(6.555f, 19.414f)
                curveTo(4.618f, 18.019f, 3.375f, 15.89f, 3.375f, 13.5f)
                curveTo(3.375f, 12.669f, 3.525f, 11.87f, 3.803f, 11.121f)
                curveTo(2.929f, 10.365f, 2.375f, 9.247f, 2.375f, 8.0f)
                curveTo(2.375f, 5.722f, 4.222f, 3.875f, 6.5f, 3.875f)
                curveTo(8.074f, 3.875f, 9.442f, 4.757f, 10.138f, 6.053f)
                curveTo(10.738f, 5.937f, 11.361f, 5.875f, 12.0f, 5.875f)
                curveTo(12.639f, 5.875f, 13.262f, 5.937f, 13.862f, 6.053f)
                curveTo(14.558f, 4.757f, 15.926f, 3.875f, 17.5f, 3.875f)
                close()
                moveTo(13.523f, 16.397f)
                curveTo(13.413f, 16.601f, 13.223f, 16.771f, 12.99f, 16.894f)
                curveTo(12.715f, 17.04f, 12.37f, 17.125f, 12.0f, 17.125f)
                curveTo(11.63f, 17.125f, 11.286f, 17.04f, 11.01f, 16.894f)
                curveTo(10.777f, 16.771f, 10.588f, 16.601f, 10.478f, 16.397f)
                curveTo(9.336f, 16.821f, 8.419f, 17.708f, 7.955f, 18.83f)
                curveTo(9.113f, 19.489f, 10.501f, 19.875f, 12.0f, 19.875f)
                curveTo(13.499f, 19.875f, 14.887f, 19.489f, 16.045f, 18.83f)
                curveTo(15.796f, 18.226f, 15.411f, 17.682f, 14.915f, 17.238f)
                curveTo(14.505f, 16.87f, 14.033f, 16.586f, 13.523f, 16.397f)
                close()
                moveTo(12.0f, 7.125f)
                curveTo(7.884f, 7.125f, 4.625f, 10.025f, 4.625f, 13.5f)
                curveTo(4.625f, 15.299f, 5.495f, 16.94f, 6.907f, 18.108f)
                curveTo(7.806f, 16.198f, 9.748f, 14.875f, 12.0f, 14.875f)
                curveTo(13.44f, 14.875f, 14.754f, 15.416f, 15.749f, 16.306f)
                curveTo(16.309f, 16.808f, 16.769f, 17.42f, 17.093f, 18.108f)
                curveTo(18.505f, 16.94f, 19.375f, 15.299f, 19.375f, 13.5f)
                curveTo(19.375f, 10.025f, 16.116f, 7.125f, 12.0f, 7.125f)
                close()
                moveTo(6.5f, 5.125f)
                curveTo(4.912f, 5.125f, 3.625f, 6.412f, 3.625f, 8.0f)
                curveTo(3.625f, 8.733f, 3.901f, 9.417f, 4.373f, 9.935f)
                curveTo(5.341f, 8.321f, 6.943f, 7.053f, 8.882f, 6.388f)
                curveTo(8.358f, 5.615f, 7.475f, 5.125f, 6.5f, 5.125f)
                close()
                moveTo(17.5f, 5.125f)
                curveTo(16.525f, 5.125f, 15.642f, 5.614f, 15.118f, 6.388f)
                curveTo(17.057f, 7.053f, 18.659f, 8.321f, 19.627f, 9.935f)
                curveTo(20.1f, 9.416f, 20.375f, 8.732f, 20.375f, 8.0f)
                curveTo(20.375f, 6.412f, 19.088f, 5.125f, 17.5f, 5.125f)
                close()
            }
        }
        .build()
        return _teddy!!
    }

@Suppress("ObjectPropertyName")
private var _teddy: ImageVector? = null

@Preview
@Composable
private fun TeddyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Teddy, contentDescription = "Teddy Icon")
    }
}

