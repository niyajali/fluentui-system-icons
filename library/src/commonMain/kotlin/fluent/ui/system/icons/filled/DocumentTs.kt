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
 * DocumentTs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a TypeScript document.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_ts_16_filled.svg)
 * 
 * @return The [ImageVector] for the DocumentTs icon.
 */
public val FluentIcons.Filled.DocumentTs: ImageVector
    get() {
        if (_documentTs != null) {
            return _documentTs!!
        }
        _documentTs = Builder(name = "DocumentTs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 1.25f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 4.78f, 10.22f, 5.0f, 10.5f, 5.0f)
                horizontalLineTo(13.75f)
                lineTo(10.0f, 1.25f)
                close()
                moveTo(10.5f, 6.0f)
                curveTo(9.67f, 6.0f, 9.0f, 5.33f, 9.0f, 4.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 1.0f, 4.0f, 1.67f, 4.0f, 2.5f)
                verticalLineTo(9.0f)
                curveTo(4.4f, 9.0f, 4.77f, 9.16f, 5.06f, 9.44f)
                curveTo(5.46f, 9.16f, 5.93f, 9.0f, 6.42f, 9.0f)
                horizontalLineTo(6.57f)
                curveTo(7.21f, 9.0f, 7.84f, 9.26f, 8.29f, 9.71f)
                curveTo(8.74f, 10.16f, 9.0f, 10.79f, 9.0f, 11.43f)
                curveTo(9.0f, 11.77f, 8.89f, 12.1f, 8.68f, 12.37f)
                curveTo(8.695f, 12.4f, 8.71f, 12.427f, 8.725f, 12.455f)
                curveTo(8.74f, 12.483f, 8.755f, 12.51f, 8.77f, 12.54f)
                curveTo(9.0f, 13.04f, 9.06f, 13.6f, 8.93f, 14.13f)
                curveTo(8.86f, 14.44f, 8.72f, 14.74f, 8.53f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(13.33f, 15.0f, 14.0f, 14.33f, 14.0f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(6.573f, 15.0f)
                horizontalLineTo(6.427f)
                curveTo(6.049f, 15.0f, 5.686f, 14.849f, 5.418f, 14.582f)
                curveTo(5.15f, 14.314f, 5.0f, 13.952f, 5.0f, 13.573f)
                curveTo(4.999f, 13.436f, 5.05f, 13.305f, 5.143f, 13.205f)
                curveTo(5.236f, 13.105f, 5.364f, 13.045f, 5.5f, 13.036f)
                curveTo(5.564f, 13.032f, 5.627f, 13.041f, 5.688f, 13.063f)
                curveTo(5.748f, 13.084f, 5.803f, 13.118f, 5.85f, 13.161f)
                curveTo(5.897f, 13.204f, 5.934f, 13.257f, 5.96f, 13.315f)
                curveTo(5.986f, 13.373f, 6.0f, 13.436f, 6.0f, 13.5f)
                curveTo(5.993f, 13.561f, 5.999f, 13.623f, 6.017f, 13.682f)
                curveTo(6.035f, 13.741f, 6.065f, 13.796f, 6.105f, 13.843f)
                curveTo(6.145f, 13.89f, 6.194f, 13.928f, 6.25f, 13.955f)
                curveTo(6.305f, 13.982f, 6.366f, 13.997f, 6.428f, 14.0f)
                horizontalLineTo(6.574f)
                curveTo(6.687f, 14.0f, 6.796f, 13.955f, 6.876f, 13.875f)
                curveTo(6.956f, 13.795f, 7.001f, 13.686f, 7.001f, 13.573f)
                curveTo(7.001f, 13.494f, 6.98f, 13.416f, 6.938f, 13.349f)
                curveTo(6.896f, 13.282f, 6.837f, 13.227f, 6.766f, 13.192f)
                lineTo(5.79f, 12.7f)
                curveTo(5.504f, 12.555f, 5.276f, 12.319f, 5.141f, 12.028f)
                curveTo(5.006f, 11.738f, 4.973f, 11.41f, 5.046f, 11.099f)
                curveTo(5.12f, 10.787f, 5.296f, 10.51f, 5.547f, 10.31f)
                curveTo(5.798f, 10.111f, 6.108f, 10.001f, 6.428f, 10.0f)
                horizontalLineTo(6.574f)
                curveTo(6.952f, 10.0f, 7.315f, 10.151f, 7.583f, 10.418f)
                curveTo(7.851f, 10.686f, 8.001f, 11.048f, 8.001f, 11.427f)
                curveTo(8.002f, 11.564f, 7.951f, 11.695f, 7.858f, 11.795f)
                curveTo(7.765f, 11.895f, 7.637f, 11.955f, 7.501f, 11.964f)
                curveTo(7.437f, 11.968f, 7.374f, 11.959f, 7.313f, 11.937f)
                curveTo(7.253f, 11.916f, 7.198f, 11.882f, 7.151f, 11.839f)
                curveTo(7.104f, 11.796f, 7.067f, 11.743f, 7.041f, 11.685f)
                curveTo(7.015f, 11.627f, 7.001f, 11.564f, 7.001f, 11.5f)
                verticalLineTo(11.427f)
                curveTo(7.001f, 11.314f, 6.956f, 11.205f, 6.876f, 11.125f)
                curveTo(6.796f, 11.045f, 6.687f, 11.0f, 6.574f, 11.0f)
                horizontalLineTo(6.428f)
                curveTo(6.315f, 11.0f, 6.206f, 11.045f, 6.126f, 11.125f)
                curveTo(6.046f, 11.205f, 6.001f, 11.314f, 6.001f, 11.427f)
                curveTo(6.001f, 11.506f, 6.022f, 11.584f, 6.064f, 11.651f)
                curveTo(6.106f, 11.718f, 6.165f, 11.773f, 6.236f, 11.808f)
                lineTo(7.212f, 12.297f)
                curveTo(7.499f, 12.441f, 7.73f, 12.677f, 7.866f, 12.969f)
                curveTo(8.002f, 13.26f, 8.036f, 13.589f, 7.962f, 13.901f)
                curveTo(7.888f, 14.214f, 7.711f, 14.492f, 7.459f, 14.692f)
                curveTo(7.207f, 14.891f, 6.894f, 15.0f, 6.573f, 15.0f)
                close()
                moveTo(4.354f, 10.854f)
                curveTo(4.447f, 10.76f, 4.5f, 10.633f, 4.5f, 10.5f)
                curveTo(4.5f, 10.367f, 4.448f, 10.24f, 4.354f, 10.146f)
                curveTo(4.26f, 10.053f, 4.133f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(1.0f)
                curveTo(0.867f, 10.0f, 0.74f, 10.052f, 0.646f, 10.146f)
                curveTo(0.553f, 10.24f, 0.5f, 10.367f, 0.5f, 10.5f)
                curveTo(0.5f, 10.633f, 0.552f, 10.76f, 0.646f, 10.854f)
                curveTo(0.74f, 10.947f, 0.867f, 11.0f, 1.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 14.633f, 2.052f, 14.76f, 2.146f, 14.854f)
                curveTo(2.24f, 14.947f, 2.367f, 15.0f, 2.5f, 15.0f)
                curveTo(2.633f, 15.0f, 2.76f, 14.948f, 2.854f, 14.854f)
                curveTo(2.947f, 14.76f, 3.0f, 14.633f, 3.0f, 14.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(4.133f, 11.0f, 4.26f, 10.948f, 4.354f, 10.854f)
                close()
            }
        }
        .build()
        return _documentTs!!
    }

@Suppress("ObjectPropertyName")
private var _documentTs: ImageVector? = null

@Preview
@Composable
private fun DocumentTsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentTs, contentDescription = "DocumentTs Icon")
    }
}

