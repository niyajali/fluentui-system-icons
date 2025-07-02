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
 * CodeCs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, cs
 * - Source: ic_fluent_code_cs_16_filled.svg
 * 
 * @return The [ImageVector] for the CodeCs icon.
 */
public val FluentIcons.Filled.CodeCs: ImageVector
    get() {
        if (_codeCs != null) {
            return _codeCs!!
        }
        _codeCs = Builder(name = "CodeCs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 5.25f)
                curveTo(3.168f, 5.25f, 2.851f, 5.382f, 2.616f, 5.616f)
                curveTo(2.382f, 5.851f, 2.25f, 6.168f, 2.25f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(2.25f, 9.832f, 2.382f, 10.149f, 2.616f, 10.384f)
                curveTo(2.851f, 10.618f, 3.168f, 10.75f, 3.5f, 10.75f)
                curveTo(3.832f, 10.75f, 4.149f, 10.618f, 4.384f, 10.384f)
                curveTo(4.618f, 10.149f, 4.75f, 9.832f, 4.75f, 9.5f)
                curveTo(4.75f, 9.086f, 5.086f, 8.75f, 5.5f, 8.75f)
                curveTo(5.914f, 8.75f, 6.25f, 9.086f, 6.25f, 9.5f)
                curveTo(6.25f, 10.229f, 5.96f, 10.929f, 5.445f, 11.444f)
                curveTo(4.929f, 11.96f, 4.229f, 12.25f, 3.5f, 12.25f)
                curveTo(2.771f, 12.25f, 2.071f, 11.96f, 1.555f, 11.444f)
                curveTo(1.04f, 10.929f, 0.75f, 10.229f, 0.75f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(0.75f, 5.771f, 1.04f, 5.071f, 1.555f, 4.555f)
                curveTo(2.071f, 4.04f, 2.771f, 3.75f, 3.5f, 3.75f)
                curveTo(4.229f, 3.75f, 4.929f, 4.04f, 5.445f, 4.555f)
                curveTo(5.96f, 5.071f, 6.25f, 5.771f, 6.25f, 6.5f)
                curveTo(6.25f, 6.914f, 5.914f, 7.25f, 5.5f, 7.25f)
                curveTo(5.086f, 7.25f, 4.75f, 6.914f, 4.75f, 6.5f)
                curveTo(4.75f, 6.168f, 4.618f, 5.851f, 4.384f, 5.616f)
                curveTo(4.149f, 5.382f, 3.832f, 5.25f, 3.5f, 5.25f)
                close()
                moveTo(9.5f, 4.25f)
                curveTo(9.914f, 4.25f, 10.25f, 4.586f, 10.25f, 5.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(5.0f)
                curveTo(11.75f, 4.586f, 12.086f, 4.25f, 12.5f, 4.25f)
                curveTo(12.914f, 4.25f, 13.25f, 4.586f, 13.25f, 5.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 5.75f, 15.0f, 6.086f, 15.0f, 6.5f)
                curveTo(15.0f, 6.914f, 14.664f, 7.25f, 14.25f, 7.25f)
                horizontalLineTo(13.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 8.75f, 15.0f, 9.086f, 15.0f, 9.5f)
                curveTo(15.0f, 9.914f, 14.664f, 10.25f, 14.25f, 10.25f)
                horizontalLineTo(13.25f)
                verticalLineTo(11.0f)
                curveTo(13.25f, 11.414f, 12.914f, 11.75f, 12.5f, 11.75f)
                curveTo(12.086f, 11.75f, 11.75f, 11.414f, 11.75f, 11.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(11.0f)
                curveTo(10.25f, 11.414f, 9.914f, 11.75f, 9.5f, 11.75f)
                curveTo(9.086f, 11.75f, 8.75f, 11.414f, 8.75f, 11.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(8.0f)
                curveTo(7.586f, 10.25f, 7.25f, 9.914f, 7.25f, 9.5f)
                curveTo(7.25f, 9.086f, 7.586f, 8.75f, 8.0f, 8.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(7.25f)
                horizontalLineTo(8.0f)
                curveTo(7.586f, 7.25f, 7.25f, 6.914f, 7.25f, 6.5f)
                curveTo(7.25f, 6.086f, 7.586f, 5.75f, 8.0f, 5.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(5.0f)
                curveTo(8.75f, 4.586f, 9.086f, 4.25f, 9.5f, 4.25f)
                close()
                moveTo(10.25f, 7.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(7.25f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _codeCs!!
    }

@Suppress("ObjectPropertyName")
private var _codeCs: ImageVector? = null

@Preview
@Composable
private fun CodeCsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeCs, contentDescription = null)
    }
}

