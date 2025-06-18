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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Road: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Road",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 3f)
            curveTo(6f, 2.448f, 5.552f, 2f, 5f, 2f)
            curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
            verticalLineTo(21f)
            curveTo(4f, 21.552f, 4.448f, 22f, 5f, 22f)
            curveTo(5.552f, 22f, 6f, 21.552f, 6f, 21f)
            verticalLineTo(3f)
            close()
            moveTo(20f, 3f)
            curveTo(20f, 2.448f, 19.552f, 2f, 19f, 2f)
            curveTo(18.448f, 2f, 18f, 2.448f, 18f, 3f)
            verticalLineTo(21f)
            curveTo(18f, 21.552f, 18.448f, 22f, 19f, 22f)
            curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
            verticalLineTo(3f)
            close()
            moveTo(13f, 3f)
            curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
            curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
            verticalLineTo(6f)
            curveTo(11f, 6.552f, 11.448f, 7f, 12f, 7f)
            curveTo(12.552f, 7f, 13f, 6.552f, 13f, 6f)
            verticalLineTo(3f)
            close()
            moveTo(11f, 13.5f)
            curveTo(11f, 14.052f, 11.448f, 14.5f, 12f, 14.5f)
            curveTo(12.552f, 14.5f, 13f, 14.052f, 13f, 13.5f)
            verticalLineTo(10.5f)
            curveTo(13f, 9.948f, 12.552f, 9.5f, 12f, 9.5f)
            curveTo(11.448f, 9.5f, 11f, 9.948f, 11f, 10.5f)
            verticalLineTo(13.5f)
            close()
            moveTo(11f, 18f)
            curveTo(11f, 17.448f, 11.448f, 17f, 12f, 17f)
            curveTo(12.552f, 17f, 13f, 17.448f, 13f, 18f)
            verticalLineTo(21f)
            curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
            curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RoadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Road, contentDescription = null)
    }
}
