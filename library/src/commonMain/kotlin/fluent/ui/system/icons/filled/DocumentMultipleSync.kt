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
 * DocumentMultipleSync icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: document, multiple, sync
 * - Source: ic_fluent_document_multiple_sync_20_filled.svg
 * 
 * @return The [ImageVector] for the DocumentMultipleSync icon.
 */
public val FluentIcons.Filled.DocumentMultipleSync: ImageVector
    get() {
        if (_documentMultipleSync != null) {
            return _documentMultipleSync!!
        }
        _documentMultipleSync = Builder(name = "DocumentMultipleSync", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 6.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 2.0f, 4.0f, 2.672f, 4.0f, 3.5f)
                verticalLineTo(9.207f)
                curveTo(4.477f, 9.072f, 4.98f, 9.0f, 5.5f, 9.0f)
                curveTo(8.538f, 9.0f, 11.0f, 11.462f, 11.0f, 14.5f)
                curveTo(11.0f, 15.02f, 10.928f, 15.523f, 10.793f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 16.0f, 15.0f, 15.328f, 15.0f, 14.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.5f)
                curveTo(9.672f, 8.0f, 9.0f, 7.328f, 9.0f, 6.5f)
                close()
                moveTo(13.061f, 18.0f)
                horizontalLineTo(9.743f)
                curveTo(9.996f, 17.693f, 10.217f, 17.358f, 10.4f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(14.657f, 17.0f, 16.0f, 15.657f, 16.0f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(16.552f, 8.0f, 17.0f, 8.448f, 17.0f, 9.0f)
                verticalLineTo(14.061f)
                curveTo(17.0f, 16.236f, 15.236f, 18.0f, 13.061f, 18.0f)
                close()
                moveTo(10.0f, 6.5f)
                verticalLineTo(2.25f)
                lineTo(14.75f, 7.0f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 7.0f, 10.0f, 6.776f, 10.0f, 6.5f)
                close()
                moveTo(1.0f, 14.5f)
                curveTo(1.0f, 16.985f, 3.015f, 19.0f, 5.5f, 19.0f)
                curveTo(7.985f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 7.985f, 10.0f, 5.5f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 12.015f, 1.0f, 14.5f)
                close()
                moveTo(7.5f, 11.5f)
                curveTo(7.776f, 11.5f, 8.0f, 11.724f, 8.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(8.0f, 13.776f, 7.776f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(5.724f, 14.0f, 5.5f, 13.776f, 5.5f, 13.5f)
                curveTo(5.5f, 13.224f, 5.724f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(6.468f)
                curveTo(6.418f, 12.972f, 6.366f, 12.946f, 6.314f, 12.923f)
                curveTo(6.068f, 12.814f, 5.803f, 12.755f, 5.535f, 12.75f)
                curveTo(5.266f, 12.746f, 5.0f, 12.795f, 4.751f, 12.896f)
                curveTo(4.502f, 12.996f, 4.276f, 13.146f, 4.086f, 13.336f)
                curveTo(3.89f, 13.531f, 3.574f, 13.531f, 3.379f, 13.336f)
                curveTo(3.183f, 13.141f, 3.183f, 12.824f, 3.379f, 12.629f)
                curveTo(3.663f, 12.344f, 4.003f, 12.119f, 4.376f, 11.968f)
                curveTo(4.75f, 11.818f, 5.15f, 11.743f, 5.552f, 11.75f)
                curveTo(5.955f, 11.757f, 6.352f, 11.846f, 6.72f, 12.009f)
                curveTo(6.816f, 12.052f, 6.91f, 12.1f, 7.0f, 12.152f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 11.724f, 7.224f, 11.5f, 7.5f, 11.5f)
                close()
                moveTo(6.624f, 17.032f)
                curveTo(6.25f, 17.183f, 5.85f, 17.257f, 5.448f, 17.25f)
                curveTo(5.045f, 17.243f, 4.648f, 17.154f, 4.28f, 16.991f)
                curveTo(4.184f, 16.948f, 4.09f, 16.9f, 4.0f, 16.848f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 17.276f, 3.776f, 17.5f, 3.5f, 17.5f)
                curveTo(3.224f, 17.5f, 3.0f, 17.276f, 3.0f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(3.0f, 15.224f, 3.224f, 15.0f, 3.5f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(5.276f, 15.0f, 5.5f, 15.224f, 5.5f, 15.5f)
                curveTo(5.5f, 15.776f, 5.276f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(4.532f)
                curveTo(4.582f, 16.028f, 4.634f, 16.054f, 4.686f, 16.077f)
                curveTo(4.932f, 16.186f, 5.197f, 16.245f, 5.465f, 16.25f)
                curveTo(5.734f, 16.254f, 6.0f, 16.205f, 6.249f, 16.104f)
                curveTo(6.498f, 16.004f, 6.724f, 15.854f, 6.914f, 15.664f)
                curveTo(7.11f, 15.469f, 7.426f, 15.469f, 7.621f, 15.664f)
                curveTo(7.817f, 15.859f, 7.817f, 16.176f, 7.621f, 16.371f)
                curveTo(7.337f, 16.656f, 6.997f, 16.881f, 6.624f, 17.032f)
                close()
            }
        }
        .build()
        return _documentMultipleSync!!
    }

@Suppress("ObjectPropertyName")
private var _documentMultipleSync: ImageVector? = null

@Preview
@Composable
private fun DocumentMultipleSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentMultipleSync, contentDescription = null)
    }
}

