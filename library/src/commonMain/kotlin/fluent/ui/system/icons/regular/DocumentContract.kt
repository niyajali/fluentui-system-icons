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
 * DocumentContract icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: document, contract
 * - Source: ic_fluent_document_contract_16_regular.svg
 * 
 * @return The [ImageVector] for the DocumentContract icon.
 */
public val FluentIcons.Regular.DocumentContract: ImageVector
    get() {
        if (_documentContract != null) {
            return _documentContract!!
        }
        _documentContract = Builder(name = "DocumentContract", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.207f, 10.5f)
                lineTo(7.854f, 9.854f)
                curveTo(7.948f, 9.76f, 8.001f, 9.633f, 8.001f, 9.5f)
                curveTo(8.001f, 9.367f, 7.948f, 9.24f, 7.854f, 9.146f)
                curveTo(7.76f, 9.052f, 7.633f, 8.999f, 7.5f, 8.999f)
                curveTo(7.367f, 8.999f, 7.24f, 9.052f, 7.146f, 9.146f)
                lineTo(6.5f, 9.793f)
                lineTo(5.854f, 9.146f)
                curveTo(5.76f, 9.052f, 5.633f, 8.999f, 5.5f, 8.999f)
                curveTo(5.367f, 8.999f, 5.24f, 9.052f, 5.146f, 9.146f)
                curveTo(5.052f, 9.24f, 5.0f, 9.367f, 5.0f, 9.5f)
                curveTo(5.0f, 9.633f, 5.052f, 9.76f, 5.146f, 9.854f)
                lineTo(5.793f, 10.5f)
                lineTo(5.146f, 11.146f)
                curveTo(5.1f, 11.193f, 5.063f, 11.248f, 5.038f, 11.308f)
                curveTo(5.012f, 11.369f, 5.0f, 11.434f, 5.0f, 11.5f)
                curveTo(5.0f, 11.566f, 5.012f, 11.631f, 5.038f, 11.692f)
                curveTo(5.063f, 11.752f, 5.1f, 11.807f, 5.146f, 11.854f)
                curveTo(5.193f, 11.901f, 5.248f, 11.937f, 5.309f, 11.962f)
                curveTo(5.369f, 11.988f, 5.434f, 12.001f, 5.5f, 12.001f)
                curveTo(5.566f, 12.001f, 5.631f, 11.988f, 5.692f, 11.962f)
                curveTo(5.752f, 11.937f, 5.808f, 11.901f, 5.854f, 11.854f)
                lineTo(6.5f, 11.207f)
                lineTo(7.146f, 11.854f)
                curveTo(7.193f, 11.901f, 7.248f, 11.937f, 7.309f, 11.962f)
                curveTo(7.369f, 11.988f, 7.434f, 12.001f, 7.5f, 12.001f)
                curveTo(7.566f, 12.001f, 7.631f, 11.988f, 7.692f, 11.962f)
                curveTo(7.752f, 11.937f, 7.808f, 11.901f, 7.854f, 11.854f)
                curveTo(7.901f, 11.807f, 7.938f, 11.752f, 7.963f, 11.692f)
                curveTo(7.988f, 11.631f, 8.001f, 11.566f, 8.001f, 11.5f)
                curveTo(8.001f, 11.434f, 7.988f, 11.369f, 7.963f, 11.308f)
                curveTo(7.938f, 11.248f, 7.901f, 11.193f, 7.854f, 11.146f)
                lineTo(7.207f, 10.5f)
                close()
                moveTo(3.586f, 1.586f)
                curveTo(3.961f, 1.211f, 4.47f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(8.586f)
                curveTo(8.984f, 1.0f, 9.365f, 1.158f, 9.646f, 1.439f)
                lineTo(12.561f, 4.354f)
                curveTo(12.842f, 4.635f, 13.0f, 5.016f, 13.0f, 5.414f)
                verticalLineTo(11.488f)
                curveTo(13.0f, 11.492f, 13.0f, 11.496f, 13.0f, 11.5f)
                curveTo(13.0f, 11.504f, 13.0f, 11.508f, 13.0f, 11.512f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.53f, 12.789f, 14.039f, 12.414f, 14.414f)
                curveTo(12.039f, 14.789f, 11.53f, 15.0f, 11.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(4.47f, 15.0f, 3.961f, 14.789f, 3.586f, 14.414f)
                curveTo(3.211f, 14.039f, 3.0f, 13.53f, 3.0f, 13.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.47f, 3.211f, 1.961f, 3.586f, 1.586f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                curveTo(9.102f, 6.0f, 8.721f, 5.842f, 8.439f, 5.561f)
                curveTo(8.158f, 5.279f, 8.0f, 4.898f, 8.0f, 4.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                curveTo(4.735f, 2.0f, 4.48f, 2.105f, 4.293f, 2.293f)
                curveTo(4.105f, 2.48f, 4.0f, 2.735f, 4.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(4.0f, 13.265f, 4.105f, 13.52f, 4.293f, 13.707f)
                curveTo(4.48f, 13.895f, 4.735f, 14.0f, 5.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(11.265f, 14.0f, 11.52f, 13.895f, 11.707f, 13.707f)
                curveTo(11.895f, 13.52f, 12.0f, 13.265f, 12.0f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                curveTo(9.368f, 12.0f, 9.24f, 11.947f, 9.147f, 11.854f)
                curveTo(9.053f, 11.76f, 9.0f, 11.633f, 9.0f, 11.5f)
                curveTo(9.0f, 11.367f, 9.053f, 11.24f, 9.147f, 11.146f)
                curveTo(9.24f, 11.053f, 9.368f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(9.5f, 5.0f)
                horizontalLineTo(11.793f)
                lineTo(9.0f, 2.207f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 4.633f, 9.053f, 4.76f, 9.146f, 4.854f)
                curveTo(9.24f, 4.947f, 9.367f, 5.0f, 9.5f, 5.0f)
                close()
            }
        }
        .build()
        return _documentContract!!
    }

@Suppress("ObjectPropertyName")
private var _documentContract: ImageVector? = null

@Preview
@Composable
private fun DocumentContractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentContract, contentDescription = null)
    }
}

