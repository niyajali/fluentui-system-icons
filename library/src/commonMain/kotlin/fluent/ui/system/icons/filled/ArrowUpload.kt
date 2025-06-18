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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowUpload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpload",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.5f, 2f)
            curveTo(4.948f, 2f, 4.5f, 2.448f, 4.5f, 3f)
            curveTo(4.5f, 3.552f, 4.948f, 4f, 5.5f, 4f)
            horizontalLineTo(18.5f)
            curveTo(19.052f, 4f, 19.5f, 3.552f, 19.5f, 3f)
            curveTo(19.5f, 2.448f, 19.052f, 2f, 18.5f, 2f)
            horizontalLineTo(5.5f)
            close()
            moveTo(12.707f, 5.793f)
            curveTo(12.317f, 5.402f, 11.683f, 5.402f, 11.293f, 5.793f)
            lineTo(6.293f, 10.793f)
            curveTo(5.902f, 11.183f, 5.902f, 11.817f, 6.293f, 12.207f)
            curveTo(6.683f, 12.598f, 7.317f, 12.598f, 7.707f, 12.207f)
            lineTo(11f, 8.914f)
            verticalLineTo(21f)
            curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
            curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
            verticalLineTo(8.914f)
            lineTo(16.293f, 12.207f)
            curveTo(16.683f, 12.598f, 17.317f, 12.598f, 17.707f, 12.207f)
            curveTo(18.098f, 11.817f, 18.098f, 11.183f, 17.707f, 10.793f)
            lineTo(12.707f, 5.793f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUploadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowUpload, contentDescription = null)
    }
}
