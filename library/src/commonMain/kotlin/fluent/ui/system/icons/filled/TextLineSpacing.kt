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

public val FluentIcons.Filled.TextLineSpacing: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextLineSpacing",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 6.414f)
            verticalLineTo(10f)
            curveTo(20f, 10.552f, 19.552f, 11f, 19f, 11f)
            curveTo(18.448f, 11f, 18f, 10.552f, 18f, 10f)
            verticalLineTo(6.414f)
            lineTo(17.707f, 6.707f)
            curveTo(17.317f, 7.098f, 16.683f, 7.098f, 16.293f, 6.707f)
            curveTo(15.902f, 6.317f, 15.902f, 5.683f, 16.293f, 5.293f)
            lineTo(18.293f, 3.293f)
            curveTo(18.389f, 3.197f, 18.499f, 3.125f, 18.617f, 3.076f)
            curveTo(18.735f, 3.027f, 18.864f, 3f, 19f, 3f)
            curveTo(19.136f, 3f, 19.265f, 3.027f, 19.383f, 3.076f)
            curveTo(19.501f, 3.125f, 19.611f, 3.197f, 19.707f, 3.293f)
            lineTo(21.707f, 5.293f)
            curveTo(22.098f, 5.683f, 22.098f, 6.317f, 21.707f, 6.707f)
            curveTo(21.317f, 7.098f, 20.683f, 7.098f, 20.293f, 6.707f)
            lineTo(20f, 6.414f)
            close()
            moveTo(2f, 6f)
            curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
            horizontalLineTo(11f)
            curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
            curveTo(12f, 6.552f, 11.552f, 7f, 11f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(14f)
            curveTo(14.552f, 11f, 15f, 11.448f, 15f, 12f)
            curveTo(15f, 12.552f, 14.552f, 13f, 14f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            close()
            moveTo(3f, 17f)
            curveTo(2.448f, 17f, 2f, 17.448f, 2f, 18f)
            curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(11f)
            curveTo(11.552f, 19f, 12f, 18.552f, 12f, 18f)
            curveTo(12f, 17.448f, 11.552f, 17f, 11f, 17f)
            horizontalLineTo(3f)
            close()
            moveTo(20f, 14f)
            verticalLineTo(17.586f)
            lineTo(20.293f, 17.293f)
            curveTo(20.683f, 16.902f, 21.317f, 16.902f, 21.707f, 17.293f)
            curveTo(22.098f, 17.683f, 22.098f, 18.317f, 21.707f, 18.707f)
            lineTo(19.707f, 20.707f)
            curveTo(19.317f, 21.098f, 18.683f, 21.098f, 18.293f, 20.707f)
            lineTo(16.293f, 18.707f)
            curveTo(15.902f, 18.317f, 15.902f, 17.683f, 16.293f, 17.293f)
            curveTo(16.683f, 16.902f, 17.317f, 16.902f, 17.707f, 17.293f)
            lineTo(18f, 17.586f)
            verticalLineTo(14f)
            curveTo(18f, 13.448f, 18.448f, 13f, 19f, 13f)
            curveTo(19.552f, 13f, 20f, 13.448f, 20f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextLineSpacingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextLineSpacing, contentDescription = null)
    }
}
