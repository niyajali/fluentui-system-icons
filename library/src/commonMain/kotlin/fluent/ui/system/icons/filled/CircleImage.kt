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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.CircleImage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleImage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.25f, 8f)
            horizontalLineTo(15.929f)
            curveTo(15.444f, 4.608f, 12.526f, 2f, 9f, 2f)
            curveTo(5.134f, 2f, 2f, 5.134f, 2f, 9f)
            curveTo(2f, 12.526f, 4.608f, 15.444f, 8f, 15.929f)
            verticalLineTo(12.25f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            close()
            moveTo(12.25f, 9f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(9f, 19.376f, 9.177f, 19.96f, 9.483f, 20.456f)
            lineTo(13.732f, 16.207f)
            curveTo(14.708f, 15.231f, 16.292f, 15.231f, 17.268f, 16.207f)
            lineTo(21.517f, 20.456f)
            curveTo(21.823f, 19.96f, 22f, 19.376f, 22f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineTo(12.25f)
            close()
            moveTo(20.456f, 21.517f)
            lineTo(16.207f, 17.268f)
            curveTo(15.817f, 16.877f, 15.183f, 16.877f, 14.793f, 17.268f)
            lineTo(10.544f, 21.517f)
            curveTo(11.04f, 21.823f, 11.624f, 22f, 12.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(19.376f, 22f, 19.96f, 21.823f, 20.456f, 21.517f)
            close()
            moveTo(19.25f, 13f)
            curveTo(19.25f, 13.69f, 18.69f, 14.25f, 18f, 14.25f)
            curveTo(17.31f, 14.25f, 16.75f, 13.69f, 16.75f, 13f)
            curveTo(16.75f, 12.31f, 17.31f, 11.75f, 18f, 11.75f)
            curveTo(18.69f, 11.75f, 19.25f, 12.31f, 19.25f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CircleImage, contentDescription = null)
    }
}
