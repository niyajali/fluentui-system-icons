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

public val FluentIcons.Filled.DecimalArrowLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DecimalArrowLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 4f)
            curveTo(8.343f, 4f, 7f, 5.343f, 7f, 7f)
            verticalLineTo(11f)
            curveTo(7f, 12.657f, 8.343f, 14f, 10f, 14f)
            curveTo(11.657f, 14f, 13f, 12.657f, 13f, 11f)
            verticalLineTo(7f)
            curveTo(13f, 5.343f, 11.657f, 4f, 10f, 4f)
            close()
            moveTo(11f, 11f)
            curveTo(11f, 11.552f, 10.552f, 12f, 10f, 12f)
            curveTo(9.448f, 12f, 9f, 11.552f, 9f, 11f)
            verticalLineTo(7f)
            curveTo(9f, 6.448f, 9.448f, 6f, 10f, 6f)
            curveTo(10.552f, 6f, 11f, 6.448f, 11f, 7f)
            verticalLineTo(11f)
            close()
            moveTo(5f, 12.5f)
            curveTo(5f, 13.328f, 4.328f, 14f, 3.5f, 14f)
            curveTo(2.672f, 14f, 2f, 13.328f, 2f, 12.5f)
            curveTo(2f, 11.672f, 2.672f, 11f, 3.5f, 11f)
            curveTo(4.328f, 11f, 5f, 11.672f, 5f, 12.5f)
            close()
            moveTo(19f, 7f)
            verticalLineTo(11f)
            curveTo(19f, 11.058f, 18.995f, 11.115f, 18.986f, 11.17f)
            curveTo(19.653f, 11.327f, 20.282f, 11.586f, 20.853f, 11.93f)
            curveTo(20.948f, 11.637f, 21f, 11.325f, 21f, 11f)
            verticalLineTo(7f)
            curveTo(21f, 5.343f, 19.657f, 4f, 18f, 4f)
            curveTo(16.343f, 4f, 15f, 5.343f, 15f, 7f)
            verticalLineTo(11f)
            curveTo(15f, 11.164f, 15.013f, 11.325f, 15.039f, 11.482f)
            curveTo(15.651f, 11.231f, 16.311f, 11.071f, 17f, 11.019f)
            lineTo(17f, 11f)
            verticalLineTo(7f)
            curveTo(17f, 6.448f, 17.448f, 6f, 18f, 6f)
            curveTo(18.552f, 6f, 19f, 6.448f, 19f, 7f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.5f, 18f)
            curveTo(20.776f, 18f, 21f, 17.776f, 21f, 17.5f)
            curveTo(21f, 17.224f, 20.776f, 17f, 20.5f, 17f)
            horizontalLineTo(15.707f)
            lineTo(17.354f, 15.354f)
            curveTo(17.549f, 15.158f, 17.549f, 14.842f, 17.354f, 14.646f)
            curveTo(17.158f, 14.451f, 16.842f, 14.451f, 16.646f, 14.646f)
            lineTo(14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.646f, 20.354f)
            curveTo(16.842f, 20.549f, 17.158f, 20.549f, 17.354f, 20.354f)
            curveTo(17.549f, 20.158f, 17.549f, 19.842f, 17.354f, 19.646f)
            lineTo(15.707f, 18f)
            horizontalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DecimalArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DecimalArrowLeft, contentDescription = null)
    }
}
