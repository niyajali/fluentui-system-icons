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
 * CodeVb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: code, vb
 * - Source: ic_fluent_code_vb_16_regular.svg
 * 
 * @return The [ImageVector] for the CodeVb icon.
 */
public val FluentIcons.Regular.CodeVb: ImageVector
    get() {
        if (_codeVb != null) {
            return _codeVb!!
        }
        _codeVb = Builder(name = "CodeVb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.278f, 7.9f)
                curveTo(13.611f, 7.593f, 13.843f, 7.193f, 13.944f, 6.752f)
                curveTo(14.046f, 6.311f, 14.012f, 5.849f, 13.847f, 5.428f)
                curveTo(13.682f, 5.007f, 13.393f, 4.645f, 13.019f, 4.39f)
                curveTo(12.645f, 4.135f, 12.203f, 3.999f, 11.75f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(9.367f, 4.0f, 9.24f, 4.053f, 9.147f, 4.147f)
                curveTo(9.053f, 4.24f, 9.0f, 4.367f, 9.0f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 11.633f, 9.053f, 11.76f, 9.147f, 11.854f)
                curveTo(9.24f, 11.947f, 9.367f, 12.0f, 9.5f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(12.48f, 12.0f, 12.947f, 11.847f, 13.333f, 11.563f)
                curveTo(13.72f, 11.278f, 14.005f, 10.878f, 14.148f, 10.42f)
                curveTo(14.29f, 9.962f, 14.283f, 9.471f, 14.127f, 9.017f)
                curveTo(13.97f, 8.564f, 13.673f, 8.173f, 13.278f, 7.9f)
                close()
                moveTo(13.0f, 6.25f)
                curveTo(13.0f, 6.581f, 12.868f, 6.899f, 12.633f, 7.133f)
                curveTo(12.399f, 7.368f, 12.081f, 7.5f, 11.75f, 7.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.75f)
                curveTo(12.081f, 5.001f, 12.399f, 5.132f, 12.633f, 5.367f)
                curveTo(12.868f, 5.601f, 13.0f, 5.919f, 13.0f, 6.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.0f)
                curveTo(12.332f, 8.5f, 12.649f, 8.632f, 12.884f, 8.866f)
                curveTo(13.118f, 9.101f, 13.25f, 9.419f, 13.25f, 9.75f)
                curveTo(13.25f, 10.082f, 13.118f, 10.399f, 12.884f, 10.634f)
                curveTo(12.649f, 10.868f, 12.332f, 11.0f, 12.0f, 11.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(7.971f, 4.668f)
                lineTo(5.471f, 11.668f)
                curveTo(5.436f, 11.765f, 5.373f, 11.849f, 5.288f, 11.909f)
                curveTo(5.204f, 11.968f, 5.103f, 12.0f, 5.0f, 12.0f)
                curveTo(4.897f, 12.0f, 4.796f, 11.968f, 4.712f, 11.909f)
                curveTo(4.628f, 11.849f, 4.564f, 11.765f, 4.529f, 11.668f)
                lineTo(2.029f, 4.668f)
                curveTo(2.007f, 4.606f, 1.997f, 4.541f, 2.001f, 4.475f)
                curveTo(2.004f, 4.409f, 2.02f, 4.345f, 2.048f, 4.286f)
                curveTo(2.076f, 4.226f, 2.116f, 4.173f, 2.165f, 4.129f)
                curveTo(2.213f, 4.085f, 2.27f, 4.051f, 2.332f, 4.029f)
                curveTo(2.394f, 4.007f, 2.46f, 3.997f, 2.525f, 4.001f)
                curveTo(2.591f, 4.004f, 2.655f, 4.02f, 2.714f, 4.048f)
                curveTo(2.774f, 4.076f, 2.827f, 4.116f, 2.871f, 4.165f)
                curveTo(2.915f, 4.213f, 2.949f, 4.27f, 2.971f, 4.332f)
                lineTo(5.0f, 10.013f)
                lineTo(7.029f, 4.332f)
                curveTo(7.074f, 4.207f, 7.166f, 4.105f, 7.286f, 4.048f)
                curveTo(7.406f, 3.991f, 7.543f, 3.985f, 7.668f, 4.029f)
                curveTo(7.793f, 4.074f, 7.895f, 4.166f, 7.952f, 4.286f)
                curveTo(8.009f, 4.406f, 8.016f, 4.543f, 7.971f, 4.668f)
                close()
            }
        }
        .build()
        return _codeVb!!
    }

@Suppress("ObjectPropertyName")
private var _codeVb: ImageVector? = null

@Preview
@Composable
private fun CodeVbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeVb, contentDescription = null)
    }
}

