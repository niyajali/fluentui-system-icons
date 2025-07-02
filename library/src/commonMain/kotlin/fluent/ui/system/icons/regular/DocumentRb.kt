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
 * DocumentRb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: document, rb
 * - Source: ic_fluent_document_rb_16_regular.svg
 * 
 * @return The [ImageVector] for the DocumentRb icon.
 */
public val FluentIcons.Regular.DocumentRb: ImageVector
    get() {
        if (_documentRb != null) {
            return _documentRb!!
        }
        _documentRb = Builder(name = "DocumentRb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.647f, 1.439f)
                lineTo(12.561f, 4.353f)
                curveTo(12.842f, 4.635f, 13.0f, 5.015f, 13.0f, 5.413f)
                verticalLineTo(12.999f)
                curveTo(13.0f, 14.104f, 12.105f, 14.999f, 11.0f, 14.999f)
                horizontalLineTo(8.744f)
                curveTo(8.889f, 14.807f, 9.01f, 14.596f, 9.094f, 14.367f)
                curveTo(9.139f, 14.246f, 9.173f, 14.124f, 9.199f, 13.999f)
                horizontalLineTo(11.0f)
                curveTo(11.552f, 13.999f, 12.0f, 13.551f, 12.0f, 12.999f)
                verticalLineTo(5.999f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 5.999f, 8.0f, 5.327f, 8.0f, 4.499f)
                verticalLineTo(1.999f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 1.999f, 4.0f, 2.447f, 4.0f, 2.999f)
                verticalLineTo(9.517f)
                curveTo(3.985f, 9.506f, 3.972f, 9.494f, 3.958f, 9.482f)
                curveTo(3.94f, 9.466f, 3.922f, 9.451f, 3.902f, 9.437f)
                curveTo(3.63f, 9.25f, 3.32f, 9.144f, 3.0f, 9.077f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 1.895f, 3.895f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(8.586f)
                curveTo(8.984f, 1.0f, 9.366f, 1.158f, 9.647f, 1.439f)
                close()
                moveTo(9.0f, 4.499f)
                curveTo(9.0f, 4.775f, 9.224f, 4.999f, 9.5f, 4.999f)
                horizontalLineTo(11.793f)
                lineTo(9.0f, 2.206f)
                verticalLineTo(4.499f)
                close()
                moveTo(7.996f, 11.599f)
                curveTo(7.978f, 11.873f, 7.885f, 12.136f, 7.727f, 12.361f)
                lineTo(7.728f, 12.362f)
                curveTo(7.961f, 12.561f, 8.126f, 12.827f, 8.203f, 13.124f)
                curveTo(8.279f, 13.421f, 8.263f, 13.734f, 8.157f, 14.021f)
                curveTo(8.05f, 14.308f, 7.858f, 14.556f, 7.607f, 14.731f)
                curveTo(7.355f, 14.906f, 7.056f, 15.0f, 6.75f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 15.0f, 5.24f, 14.948f, 5.146f, 14.854f)
                curveTo(5.053f, 14.76f, 5.0f, 14.633f, 5.0f, 14.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.367f, 5.052f, 10.24f, 5.146f, 10.146f)
                curveTo(5.24f, 10.053f, 5.367f, 10.0f, 5.5f, 10.0f)
                horizontalLineTo(6.5f)
                curveTo(6.774f, 10.0f, 7.043f, 10.075f, 7.278f, 10.218f)
                curveTo(7.512f, 10.36f, 7.703f, 10.564f, 7.83f, 10.808f)
                curveTo(7.957f, 11.051f, 8.014f, 11.325f, 7.996f, 11.599f)
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
        Image(imageVector = FluentIcons.Regular.DocumentRb, contentDescription = null)
    }
}

