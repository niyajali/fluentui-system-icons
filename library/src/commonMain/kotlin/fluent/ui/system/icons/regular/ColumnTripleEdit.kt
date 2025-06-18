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

public val FluentUi.Regular.ColumnTripleEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColumnTripleEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 18.5f)
            curveTo(2f, 19.881f, 3.119f, 21f, 4.5f, 21f)
            horizontalLineTo(5.5f)
            curveTo(6.881f, 21f, 8f, 19.881f, 8f, 18.5f)
            lineTo(8f, 5.5f)
            curveTo(8f, 4.119f, 6.881f, 3f, 5.5f, 3f)
            horizontalLineTo(4.5f)
            curveTo(3.119f, 3f, 2f, 4.119f, 2f, 5.5f)
            verticalLineTo(18.5f)
            close()
            moveTo(4.5f, 19.5f)
            curveTo(3.948f, 19.5f, 3.5f, 19.052f, 3.5f, 18.5f)
            lineTo(3.5f, 5.5f)
            curveTo(3.5f, 4.948f, 3.948f, 4.5f, 4.5f, 4.5f)
            horizontalLineTo(5.5f)
            curveTo(6.052f, 4.5f, 6.5f, 4.948f, 6.5f, 5.5f)
            lineTo(6.5f, 18.5f)
            curveTo(6.5f, 19.052f, 6.052f, 19.5f, 5.5f, 19.5f)
            horizontalLineTo(4.5f)
            close()
            moveTo(9f, 18.5f)
            curveTo(9f, 19.769f, 9.946f, 20.817f, 11.17f, 20.979f)
            lineTo(11.521f, 19.577f)
            curveTo(11.527f, 19.551f, 11.534f, 19.525f, 11.541f, 19.5f)
            horizontalLineTo(11.5f)
            curveTo(10.948f, 19.5f, 10.5f, 19.052f, 10.5f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(10.5f, 4.948f, 10.948f, 4.5f, 11.5f, 4.5f)
            horizontalLineTo(12.5f)
            curveTo(13.052f, 4.5f, 13.5f, 4.948f, 13.5f, 5.5f)
            verticalLineTo(16.855f)
            lineTo(15f, 15.355f)
            verticalLineTo(5.5f)
            curveTo(15f, 4.119f, 13.881f, 3f, 12.5f, 3f)
            horizontalLineTo(11.5f)
            curveTo(10.119f, 3f, 9f, 4.119f, 9f, 5.5f)
            lineTo(9f, 18.5f)
            close()
            moveTo(19.5f, 21f)
            horizontalLineTo(18.648f)
            lineTo(22f, 17.648f)
            verticalLineTo(18.5f)
            curveTo(22f, 19.881f, 20.881f, 21f, 19.5f, 21f)
            close()
            moveTo(22f, 5.5f)
            verticalLineTo(11.26f)
            curveTo(21.523f, 11.058f, 21.008f, 10.974f, 20.5f, 11.007f)
            verticalLineTo(5.5f)
            curveTo(20.5f, 4.948f, 20.052f, 4.5f, 19.5f, 4.5f)
            horizontalLineTo(18.5f)
            curveTo(17.948f, 4.5f, 17.5f, 4.948f, 17.5f, 5.5f)
            lineTo(17.5f, 12.855f)
            lineTo(16f, 14.355f)
            lineTo(16f, 5.5f)
            curveTo(16f, 4.119f, 17.119f, 3f, 18.5f, 3f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 3f, 22f, 4.119f, 22f, 5.5f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColumnTripleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ColumnTripleEdit, contentDescription = null)
    }
}
