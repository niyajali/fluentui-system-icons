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
 * DocumentRb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: document, rb
 * - Source: ic_fluent_document_rb_16_filled.svg
 * 
 * @return The [ImageVector] for the DocumentRb icon.
 */
public val FluentIcons.Filled.DocumentRb: ImageVector
    get() {
        if (_documentRb != null) {
            return _documentRb!!
        }
        _documentRb = Builder(name = "DocumentRb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 5.0f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 5.0f, 10.0f, 4.776f, 10.0f, 4.5f)
                verticalLineTo(1.25f)
                lineTo(13.75f, 5.0f)
                close()
                moveTo(9.0f, 4.5f)
                curveTo(9.0f, 5.328f, 9.672f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.498f)
                curveTo(14.0f, 14.326f, 13.328f, 14.998f, 12.5f, 14.998f)
                horizontalLineTo(8.744f)
                curveTo(8.888f, 14.806f, 9.009f, 14.596f, 9.096f, 14.365f)
                curveTo(9.273f, 13.885f, 9.299f, 13.369f, 9.171f, 12.871f)
                curveTo(9.111f, 12.637f, 9.017f, 12.415f, 8.895f, 12.212f)
                curveTo(8.949f, 12.034f, 8.982f, 11.85f, 8.995f, 11.662f)
                curveTo(9.025f, 11.204f, 8.929f, 10.748f, 8.718f, 10.344f)
                curveTo(8.507f, 9.941f, 8.19f, 9.602f, 7.798f, 9.362f)
                curveTo(7.406f, 9.125f, 6.958f, 9.0f, 6.501f, 9.0f)
                horizontalLineTo(5.501f)
                curveTo(5.1f, 9.0f, 4.723f, 9.157f, 4.444f, 9.436f)
                curveTo(4.361f, 9.518f, 4.29f, 9.607f, 4.229f, 9.703f)
                curveTo(4.17f, 9.647f, 4.105f, 9.597f, 4.041f, 9.548f)
                curveTo(4.027f, 9.538f, 4.013f, 9.527f, 4.0f, 9.517f)
                verticalLineTo(2.5f)
                curveTo(4.0f, 1.672f, 4.672f, 1.0f, 5.5f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(7.996f, 11.6f)
                curveTo(7.978f, 11.874f, 7.885f, 12.137f, 7.727f, 12.362f)
                lineTo(7.728f, 12.363f)
                curveTo(7.961f, 12.562f, 8.126f, 12.828f, 8.203f, 13.125f)
                curveTo(8.279f, 13.422f, 8.263f, 13.735f, 8.157f, 14.022f)
                curveTo(8.05f, 14.309f, 7.858f, 14.557f, 7.607f, 14.732f)
                curveTo(7.355f, 14.907f, 7.056f, 15.001f, 6.75f, 15.001f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 15.001f, 5.24f, 14.949f, 5.146f, 14.855f)
                curveTo(5.053f, 14.761f, 5.0f, 14.634f, 5.0f, 14.501f)
                verticalLineTo(10.501f)
                curveTo(5.0f, 10.368f, 5.052f, 10.241f, 5.146f, 10.147f)
                curveTo(5.24f, 10.054f, 5.367f, 10.001f, 5.5f, 10.001f)
                horizontalLineTo(6.5f)
                curveTo(6.774f, 10.001f, 7.043f, 10.076f, 7.278f, 10.219f)
                curveTo(7.512f, 10.361f, 7.703f, 10.565f, 7.83f, 10.809f)
                curveTo(7.957f, 11.052f, 8.014f, 11.326f, 7.996f, 11.6f)
                close()
                moveTo(6.5f, 10.999f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.999f)
                horizontalLineTo(6.5f)
                curveTo(6.633f, 11.999f, 6.76f, 11.947f, 6.854f, 11.853f)
                curveTo(6.947f, 11.759f, 7.0f, 11.632f, 7.0f, 11.499f)
                curveTo(7.0f, 11.366f, 6.948f, 11.239f, 6.854f, 11.145f)
                curveTo(6.76f, 11.052f, 6.633f, 10.999f, 6.5f, 10.999f)
                close()
                moveTo(6.0f, 13.999f)
                horizontalLineTo(6.75f)
                curveTo(6.883f, 13.999f, 7.01f, 13.947f, 7.104f, 13.853f)
                curveTo(7.197f, 13.759f, 7.25f, 13.632f, 7.25f, 13.499f)
                curveTo(7.25f, 13.366f, 7.198f, 13.239f, 7.104f, 13.145f)
                curveTo(7.01f, 13.052f, 6.883f, 12.999f, 6.75f, 12.999f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.999f)
                close()
                moveTo(3.522f, 12.587f)
                curveTo(3.759f, 12.98f, 3.928f, 13.41f, 4.022f, 13.859f)
                curveTo(4.029f, 13.885f, 4.036f, 13.911f, 4.042f, 13.936f)
                curveTo(4.06f, 14.012f, 4.077f, 14.081f, 4.096f, 14.136f)
                curveTo(4.168f, 14.204f, 4.218f, 14.293f, 4.24f, 14.391f)
                curveTo(4.261f, 14.488f, 4.253f, 14.59f, 4.216f, 14.683f)
                curveTo(4.179f, 14.776f, 4.115f, 14.856f, 4.032f, 14.912f)
                curveTo(3.95f, 14.969f, 3.852f, 14.999f, 3.752f, 14.999f)
                curveTo(3.276f, 14.999f, 3.162f, 14.541f, 3.052f, 14.1f)
                lineTo(3.052f, 14.099f)
                lineTo(3.049f, 14.088f)
                curveTo(2.958f, 13.729f, 2.773f, 12.999f, 2.5f, 12.999f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.499f)
                curveTo(2.0f, 14.632f, 1.948f, 14.759f, 1.854f, 14.853f)
                curveTo(1.76f, 14.946f, 1.633f, 14.999f, 1.5f, 14.999f)
                curveTo(1.367f, 14.999f, 1.24f, 14.947f, 1.146f, 14.853f)
                curveTo(1.053f, 14.759f, 1.0f, 14.632f, 1.0f, 14.499f)
                verticalLineTo(10.499f)
                curveTo(1.0f, 10.366f, 1.052f, 10.239f, 1.146f, 10.145f)
                curveTo(1.24f, 10.052f, 1.367f, 9.999f, 1.5f, 9.999f)
                horizontalLineTo(2.501f)
                curveTo(2.8f, 10.001f, 3.091f, 10.093f, 3.338f, 10.262f)
                curveTo(3.585f, 10.431f, 3.775f, 10.67f, 3.885f, 10.948f)
                curveTo(3.994f, 11.226f, 4.019f, 11.531f, 3.954f, 11.823f)
                curveTo(3.889f, 12.115f, 3.739f, 12.381f, 3.522f, 12.587f)
                close()
                moveTo(2.5f, 10.999f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.999f)
                horizontalLineTo(2.5f)
                curveTo(2.633f, 11.999f, 2.76f, 11.947f, 2.854f, 11.853f)
                curveTo(2.947f, 11.759f, 3.0f, 11.632f, 3.0f, 11.499f)
                curveTo(3.0f, 11.366f, 2.948f, 11.239f, 2.854f, 11.145f)
                curveTo(2.76f, 11.052f, 2.633f, 10.999f, 2.5f, 10.999f)
                close()
            }
        }
        .build()
        return _documentRb!!
    }

@Suppress("ObjectPropertyName")
private var _documentRb: ImageVector? = null

@Preview
@Composable
private fun DocumentRbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentRb, contentDescription = null)
    }
}

