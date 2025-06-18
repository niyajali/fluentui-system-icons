/**
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CircleImage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleImage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 3.5f)
            curveTo(5.962f, 3.5f, 3.5f, 5.962f, 3.5f, 9f)
            curveTo(3.5f, 11.696f, 5.44f, 13.939f, 8f, 14.409f)
            verticalLineTo(15.929f)
            curveTo(4.608f, 15.444f, 2f, 12.526f, 2f, 9f)
            curveTo(2f, 5.134f, 5.134f, 2f, 9f, 2f)
            curveTo(12.526f, 2f, 15.444f, 4.608f, 15.929f, 8f)
            horizontalLineTo(14.409f)
            curveTo(13.939f, 5.44f, 11.696f, 3.5f, 9f, 3.5f)
            close()
            moveTo(14.793f, 17.268f)
            curveTo(15.183f, 16.877f, 15.817f, 16.877f, 16.207f, 17.268f)
            lineTo(19.338f, 20.399f)
            curveTo(19.154f, 20.464f, 18.956f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(12.25f)
            curveTo(12.044f, 20.5f, 11.846f, 20.464f, 11.662f, 20.399f)
            lineTo(14.793f, 17.268f)
            close()
            moveTo(10.601f, 19.338f)
            curveTo(10.536f, 19.154f, 10.5f, 18.956f, 10.5f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(10.5f, 11.283f, 11.283f, 10.5f, 12.25f, 10.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 10.5f, 20.5f, 11.283f, 20.5f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 18.956f, 20.464f, 19.154f, 20.399f, 19.338f)
            lineTo(17.268f, 16.207f)
            curveTo(16.292f, 15.231f, 14.708f, 15.231f, 13.732f, 16.207f)
            lineTo(10.601f, 19.338f)
            close()
            moveTo(19.25f, 13f)
            curveTo(19.25f, 13.69f, 18.69f, 14.25f, 18f, 14.25f)
            curveTo(17.31f, 14.25f, 16.75f, 13.69f, 16.75f, 13f)
            curveTo(16.75f, 12.31f, 17.31f, 11.75f, 18f, 11.75f)
            curveTo(18.69f, 11.75f, 19.25f, 12.31f, 19.25f, 13f)
            close()
            moveTo(12.25f, 9f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(9f, 20.545f, 10.455f, 22f, 12.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineTo(12.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CircleImage, contentDescription = null)
    }
}
