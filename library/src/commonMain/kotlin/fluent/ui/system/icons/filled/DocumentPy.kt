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
 * DocumentPy icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: document, py
 * - Source: ic_fluent_document_py_16_filled.svg
 * 
 * @return The [ImageVector] for the DocumentPy icon.
 */
public val FluentIcons.Filled.DocumentPy: ImageVector
    get() {
        if (_documentPy != null) {
            return _documentPy!!
        }
        _documentPy = Builder(name = "DocumentPy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                horizontalLineTo(7.91f)
                curveTo(7.97f, 14.84f, 8.0f, 14.68f, 8.0f, 14.5f)
                verticalLineTo(13.0f)
                lineTo(9.2f, 11.4f)
                curveTo(9.44f, 11.09f, 9.54f, 10.68f, 9.48f, 10.29f)
                curveTo(9.43f, 9.89f, 9.22f, 9.54f, 8.9f, 9.3f)
                curveTo(8.65f, 9.11f, 8.32f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(7.85f)
                lineTo(7.78f, 9.02f)
                curveTo(7.39f, 9.07f, 7.04f, 9.28f, 6.8f, 9.6f)
                lineTo(6.5f, 10.0f)
                lineTo(6.2f, 9.6f)
                curveTo(5.96f, 9.28f, 5.62f, 9.08f, 5.21f, 9.01f)
                lineTo(5.07f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.67f, 9.0f, 4.35f, 9.11f, 4.1f, 9.3f)
                curveTo(4.06f, 9.33f, 4.03f, 9.36f, 4.0f, 9.39f)
                lineTo(4.0f, 2.5f)
                curveTo(4.0f, 1.67f, 4.67f, 1.0f, 5.5f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(1.5f, 10.0f)
                horizontalLineTo(2.5f)
                curveTo(2.898f, 10.0f, 3.28f, 10.158f, 3.561f, 10.439f)
                curveTo(3.842f, 10.721f, 4.0f, 11.102f, 4.0f, 11.5f)
                curveTo(4.0f, 11.898f, 3.842f, 12.28f, 3.561f, 12.561f)
                curveTo(3.279f, 12.842f, 2.898f, 13.0f, 2.5f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 14.633f, 1.948f, 14.76f, 1.854f, 14.854f)
                curveTo(1.76f, 14.947f, 1.633f, 15.0f, 1.5f, 15.0f)
                curveTo(1.367f, 15.0f, 1.24f, 14.948f, 1.146f, 14.854f)
                curveTo(1.053f, 14.76f, 1.0f, 14.633f, 1.0f, 14.5f)
                verticalLineTo(10.5f)
                curveTo(1.0f, 10.367f, 1.052f, 10.24f, 1.146f, 10.146f)
                curveTo(1.24f, 10.053f, 1.367f, 10.0f, 1.5f, 10.0f)
                close()
                moveTo(2.0f, 12.0f)
                horizontalLineTo(2.5f)
                curveTo(2.633f, 12.0f, 2.76f, 11.948f, 2.854f, 11.854f)
                curveTo(2.947f, 11.76f, 3.0f, 11.633f, 3.0f, 11.5f)
                curveTo(3.0f, 11.367f, 2.948f, 11.24f, 2.854f, 11.146f)
                curveTo(2.76f, 11.053f, 2.633f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(7.0f, 12.666f)
                lineTo(8.4f, 10.8f)
                curveTo(8.48f, 10.694f, 8.514f, 10.56f, 8.495f, 10.429f)
                curveTo(8.476f, 10.298f, 8.406f, 10.18f, 8.3f, 10.1f)
                curveTo(8.194f, 10.02f, 8.06f, 9.986f, 7.929f, 10.005f)
                curveTo(7.798f, 10.024f, 7.68f, 10.094f, 7.6f, 10.2f)
                lineTo(6.5f, 11.667f)
                lineTo(5.4f, 10.2f)
                curveTo(5.321f, 10.094f, 5.202f, 10.024f, 5.071f, 10.005f)
                curveTo(4.939f, 9.986f, 4.806f, 10.02f, 4.7f, 10.1f)
                curveTo(4.648f, 10.139f, 4.603f, 10.189f, 4.57f, 10.245f)
                curveTo(4.536f, 10.301f, 4.514f, 10.364f, 4.505f, 10.429f)
                curveTo(4.496f, 10.494f, 4.5f, 10.56f, 4.516f, 10.624f)
                curveTo(4.532f, 10.688f, 4.561f, 10.747f, 4.6f, 10.8f)
                lineTo(6.0f, 12.666f)
                verticalLineTo(14.5f)
                curveTo(6.0f, 14.633f, 6.052f, 14.76f, 6.146f, 14.854f)
                curveTo(6.24f, 14.947f, 6.367f, 15.0f, 6.5f, 15.0f)
                curveTo(6.633f, 15.0f, 6.76f, 14.948f, 6.854f, 14.854f)
                curveTo(6.947f, 14.76f, 7.0f, 14.633f, 7.0f, 14.5f)
                verticalLineTo(12.666f)
                close()
            }
        }
        .build()
        return _documentPy!!
    }

@Suppress("ObjectPropertyName")
private var _documentPy: ImageVector? = null

@Preview
@Composable
private fun DocumentPyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPy, contentDescription = null)
    }
}

