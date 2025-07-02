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
 * DocumentVb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: document, vb
 * - Source: ic_fluent_document_vb_16_filled.svg
 * 
 * @return The [ImageVector] for the DocumentVb icon.
 */
public val FluentIcons.Filled.DocumentVb: ImageVector
    get() {
        if (_documentVb != null) {
            return _documentVb!!
        }
        _documentVb = Builder(name = "DocumentVb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.5f)
                verticalLineTo(1.25f)
                lineTo(13.75f, 5.0f)
                horizontalLineTo(10.5f)
                curveTo(10.22f, 5.0f, 10.0f, 4.78f, 10.0f, 4.5f)
                close()
                moveTo(9.0f, 4.5f)
                curveTo(9.0f, 5.33f, 9.67f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                curveTo(14.0f, 14.33f, 13.33f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(8.75f)
                curveTo(8.89f, 14.81f, 9.01f, 14.6f, 9.1f, 14.37f)
                curveTo(9.27f, 13.89f, 9.3f, 13.37f, 9.17f, 12.87f)
                curveTo(9.11f, 12.64f, 9.02f, 12.42f, 8.89f, 12.21f)
                curveTo(8.95f, 12.04f, 8.98f, 11.85f, 8.99f, 11.66f)
                curveTo(9.02f, 11.21f, 8.93f, 10.75f, 8.72f, 10.34f)
                curveTo(8.51f, 9.94f, 8.19f, 9.6f, 7.8f, 9.36f)
                curveTo(7.41f, 9.12f, 6.96f, 9.0f, 6.5f, 9.0f)
                horizontalLineTo(5.5f)
                curveTo(5.23f, 9.0f, 4.97f, 9.07f, 4.75f, 9.2f)
                curveTo(4.68f, 9.16f, 4.6f, 9.12f, 4.52f, 9.09f)
                curveTo(4.35f, 9.03f, 4.18f, 9.0f, 4.0f, 9.0f)
                verticalLineTo(2.5f)
                curveTo(4.0f, 1.67f, 4.67f, 1.0f, 5.5f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
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
                moveTo(6.5f, 10.998f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.998f)
                horizontalLineTo(6.5f)
                curveTo(6.633f, 11.998f, 6.76f, 11.946f, 6.854f, 11.852f)
                curveTo(6.947f, 11.758f, 7.0f, 11.631f, 7.0f, 11.498f)
                curveTo(7.0f, 11.365f, 6.948f, 11.238f, 6.854f, 11.144f)
                curveTo(6.76f, 11.051f, 6.633f, 10.998f, 6.5f, 10.998f)
                close()
                moveTo(6.0f, 13.998f)
                horizontalLineTo(6.75f)
                curveTo(6.883f, 13.998f, 7.01f, 13.946f, 7.104f, 13.852f)
                curveTo(7.197f, 13.758f, 7.25f, 13.631f, 7.25f, 13.498f)
                curveTo(7.25f, 13.365f, 7.198f, 13.238f, 7.104f, 13.144f)
                curveTo(7.01f, 13.051f, 6.883f, 12.998f, 6.75f, 12.998f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.998f)
                close()
                moveTo(2.968f, 14.674f)
                lineTo(4.468f, 10.674f)
                verticalLineTo(10.675f)
                curveTo(4.514f, 10.551f, 4.509f, 10.414f, 4.454f, 10.293f)
                curveTo(4.4f, 10.172f, 4.299f, 10.078f, 4.175f, 10.031f)
                curveTo(4.051f, 9.985f, 3.914f, 9.989f, 3.793f, 10.044f)
                curveTo(3.672f, 10.098f, 3.578f, 10.199f, 3.531f, 10.323f)
                lineTo(2.499f, 13.075f)
                lineTo(1.467f, 10.323f)
                curveTo(1.42f, 10.199f, 1.326f, 10.099f, 1.205f, 10.044f)
                curveTo(1.085f, 9.989f, 0.947f, 9.984f, 0.823f, 10.031f)
                curveTo(0.699f, 10.078f, 0.599f, 10.172f, 0.544f, 10.293f)
                curveTo(0.517f, 10.353f, 0.502f, 10.417f, 0.5f, 10.483f)
                curveTo(0.498f, 10.548f, 0.509f, 10.614f, 0.532f, 10.675f)
                lineTo(2.032f, 14.674f)
                curveTo(2.067f, 14.769f, 2.131f, 14.851f, 2.215f, 14.909f)
                curveTo(2.299f, 14.967f, 2.398f, 14.998f, 2.5f, 14.998f)
                curveTo(2.602f, 14.998f, 2.701f, 14.967f, 2.785f, 14.909f)
                curveTo(2.868f, 14.851f, 2.932f, 14.769f, 2.968f, 14.674f)
                close()
            }
        }
        .build()
        return _documentVb!!
    }

@Suppress("ObjectPropertyName")
private var _documentVb: ImageVector? = null

@Preview
@Composable
private fun DocumentVbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentVb, contentDescription = null)
    }
}

