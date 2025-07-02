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
 * DocumentTs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: document, ts
 * - Source: ic_fluent_document_ts_16_regular.svg
 * 
 * @return The [ImageVector] for the DocumentTs icon.
 */
public val FluentIcons.Regular.DocumentTs: ImageVector
    get() {
        if (_documentTs != null) {
            return _documentTs!!
        }
        _documentTs = Builder(name = "DocumentTs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.56f, 4.35f)
                lineTo(9.65f, 1.44f)
                curveTo(9.368f, 1.16f, 8.987f, 1.002f, 8.59f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(4.47f, 1.002f, 3.962f, 1.213f, 3.588f, 1.588f)
                curveTo(3.213f, 1.962f, 3.002f, 2.47f, 3.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.735f, 4.105f, 2.48f, 4.293f, 2.293f)
                curveTo(4.48f, 2.105f, 4.735f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 4.898f, 8.158f, 5.279f, 8.439f, 5.561f)
                curveTo(8.721f, 5.842f, 9.102f, 6.0f, 9.5f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                curveTo(12.0f, 13.265f, 11.895f, 13.52f, 11.707f, 13.707f)
                curveTo(11.52f, 13.895f, 11.265f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(8.96f)
                curveTo(8.9f, 14.361f, 8.756f, 14.704f, 8.54f, 15.0f)
                horizontalLineTo(11.0f)
                curveTo(11.53f, 14.998f, 12.038f, 14.787f, 12.413f, 14.413f)
                curveTo(12.787f, 14.038f, 12.998f, 13.53f, 13.0f, 13.0f)
                verticalLineTo(5.41f)
                curveTo(12.998f, 5.013f, 12.84f, 4.632f, 12.56f, 4.35f)
                close()
                moveTo(9.5f, 5.0f)
                curveTo(9.367f, 5.0f, 9.24f, 4.947f, 9.146f, 4.854f)
                curveTo(9.053f, 4.76f, 9.0f, 4.633f, 9.0f, 4.5f)
                verticalLineTo(2.21f)
                lineTo(11.79f, 5.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(6.573f, 15.0f)
                horizontalLineTo(6.427f)
                curveTo(6.049f, 15.0f, 5.686f, 14.849f, 5.418f, 14.582f)
                curveTo(5.151f, 14.314f, 5.0f, 13.951f, 5.0f, 13.573f)
                curveTo(4.999f, 13.436f, 5.05f, 13.305f, 5.143f, 13.205f)
                curveTo(5.236f, 13.105f, 5.364f, 13.044f, 5.5f, 13.036f)
                curveTo(5.564f, 13.032f, 5.627f, 13.041f, 5.688f, 13.063f)
                curveTo(5.748f, 13.084f, 5.803f, 13.118f, 5.849f, 13.161f)
                curveTo(5.896f, 13.204f, 5.934f, 13.257f, 5.96f, 13.315f)
                curveTo(5.985f, 13.373f, 5.999f, 13.436f, 6.0f, 13.5f)
                curveTo(5.993f, 13.561f, 5.999f, 13.623f, 6.017f, 13.682f)
                curveTo(6.035f, 13.741f, 6.065f, 13.796f, 6.105f, 13.843f)
                curveTo(6.145f, 13.89f, 6.194f, 13.928f, 6.249f, 13.955f)
                curveTo(6.305f, 13.982f, 6.365f, 13.997f, 6.427f, 14.0f)
                horizontalLineTo(6.573f)
                curveTo(6.686f, 14.0f, 6.795f, 13.955f, 6.875f, 13.875f)
                curveTo(6.955f, 13.795f, 7.0f, 13.686f, 7.0f, 13.573f)
                curveTo(7.001f, 13.494f, 6.979f, 13.416f, 6.937f, 13.349f)
                curveTo(6.896f, 13.281f, 6.836f, 13.227f, 6.765f, 13.192f)
                lineTo(5.789f, 12.7f)
                curveTo(5.503f, 12.555f, 5.275f, 12.319f, 5.14f, 12.028f)
                curveTo(5.005f, 11.738f, 4.971f, 11.41f, 5.045f, 11.099f)
                curveTo(5.119f, 10.787f, 5.295f, 10.509f, 5.546f, 10.31f)
                curveTo(5.796f, 10.111f, 6.107f, 10.002f, 6.427f, 10.0f)
                horizontalLineTo(6.573f)
                curveTo(6.951f, 10.0f, 7.314f, 10.151f, 7.582f, 10.418f)
                curveTo(7.849f, 10.686f, 8.0f, 11.049f, 8.0f, 11.427f)
                curveTo(8.001f, 11.564f, 7.95f, 11.695f, 7.857f, 11.795f)
                curveTo(7.764f, 11.895f, 7.636f, 11.956f, 7.5f, 11.964f)
                curveTo(7.436f, 11.968f, 7.373f, 11.959f, 7.313f, 11.937f)
                curveTo(7.252f, 11.916f, 7.197f, 11.882f, 7.151f, 11.839f)
                curveTo(7.104f, 11.796f, 7.066f, 11.743f, 7.041f, 11.685f)
                curveTo(7.015f, 11.627f, 7.001f, 11.564f, 7.0f, 11.5f)
                verticalLineTo(11.427f)
                curveTo(7.0f, 11.314f, 6.955f, 11.205f, 6.875f, 11.125f)
                curveTo(6.795f, 11.045f, 6.686f, 11.0f, 6.573f, 11.0f)
                horizontalLineTo(6.427f)
                curveTo(6.314f, 11.0f, 6.205f, 11.045f, 6.125f, 11.125f)
                curveTo(6.045f, 11.205f, 6.0f, 11.314f, 6.0f, 11.427f)
                curveTo(6.0f, 11.506f, 6.021f, 11.584f, 6.063f, 11.651f)
                curveTo(6.104f, 11.719f, 6.164f, 11.773f, 6.235f, 11.808f)
                lineTo(7.211f, 12.297f)
                curveTo(7.498f, 12.441f, 7.729f, 12.677f, 7.865f, 12.969f)
                curveTo(8.001f, 13.26f, 8.035f, 13.588f, 7.961f, 13.901f)
                curveTo(7.887f, 14.214f, 7.71f, 14.492f, 7.458f, 14.692f)
                curveTo(7.206f, 14.891f, 6.894f, 15.0f, 6.573f, 15.0f)
                close()
                moveTo(4.354f, 10.854f)
                curveTo(4.447f, 10.76f, 4.5f, 10.633f, 4.5f, 10.5f)
                curveTo(4.5f, 10.367f, 4.447f, 10.24f, 4.354f, 10.146f)
                curveTo(4.26f, 10.053f, 4.133f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(1.0f)
                curveTo(0.867f, 10.0f, 0.74f, 10.053f, 0.646f, 10.146f)
                curveTo(0.553f, 10.24f, 0.5f, 10.367f, 0.5f, 10.5f)
                curveTo(0.5f, 10.633f, 0.553f, 10.76f, 0.646f, 10.854f)
                curveTo(0.74f, 10.947f, 0.867f, 11.0f, 1.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 14.633f, 2.053f, 14.76f, 2.146f, 14.854f)
                curveTo(2.24f, 14.947f, 2.367f, 15.0f, 2.5f, 15.0f)
                curveTo(2.633f, 15.0f, 2.76f, 14.947f, 2.854f, 14.854f)
                curveTo(2.947f, 14.76f, 3.0f, 14.633f, 3.0f, 14.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(4.133f, 11.0f, 4.26f, 10.947f, 4.354f, 10.854f)
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
        Image(imageVector = FluentIcons.Regular.DocumentTs, contentDescription = null)
    }
}

