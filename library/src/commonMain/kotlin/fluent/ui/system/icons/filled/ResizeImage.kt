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

public val FluentIcons.Filled.ResizeImage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ResizeImage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 3f)
            curveTo(11f, 2.448f, 10.552f, 2f, 10f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(10f)
            curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
            curveTo(3.552f, 11f, 4f, 10.552f, 4f, 10f)
            verticalLineTo(5.25f)
            curveTo(4f, 4.56f, 4.56f, 4f, 5.25f, 4f)
            horizontalLineTo(10f)
            curveTo(10.552f, 4f, 11f, 3.552f, 11f, 3f)
            close()
            moveTo(14f, 2f)
            curveTo(13.448f, 2f, 13f, 2.448f, 13f, 3f)
            curveTo(13f, 3.552f, 13.448f, 4f, 14f, 4f)
            horizontalLineTo(18.75f)
            curveTo(19.44f, 4f, 20f, 4.56f, 20f, 5.25f)
            verticalLineTo(10f)
            curveTo(20f, 10.552f, 20.448f, 11f, 21f, 11f)
            curveTo(21.552f, 11f, 22f, 10.552f, 22f, 10f)
            verticalLineTo(5.25f)
            curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
            horizontalLineTo(14f)
            close()
            moveTo(14f, 22f)
            curveTo(13.448f, 22f, 13f, 21.552f, 13f, 21f)
            curveTo(13f, 20.448f, 13.448f, 20f, 14f, 20f)
            horizontalLineTo(18.75f)
            curveTo(19.44f, 20f, 20f, 19.44f, 20f, 18.75f)
            verticalLineTo(14f)
            curveTo(20f, 13.448f, 20.448f, 13f, 21f, 13f)
            curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(14f)
            close()
            moveTo(4f, 12f)
            curveTo(2.343f, 12f, 1f, 13.343f, 1f, 15f)
            verticalLineTo(20f)
            curveTo(1f, 20.556f, 1.151f, 21.077f, 1.415f, 21.524f)
            lineTo(4.909f, 18.03f)
            curveTo(5.788f, 17.152f, 7.212f, 17.152f, 8.091f, 18.03f)
            lineTo(11.585f, 21.524f)
            curveTo(11.849f, 21.077f, 12f, 20.556f, 12f, 20f)
            verticalLineTo(15f)
            curveTo(12f, 13.343f, 10.657f, 12f, 9f, 12f)
            horizontalLineTo(4f)
            close()
            moveTo(4f, 23f)
            curveTo(3.444f, 23f, 2.923f, 22.849f, 2.476f, 22.585f)
            lineTo(5.97f, 19.091f)
            curveTo(6.263f, 18.798f, 6.737f, 18.798f, 7.03f, 19.091f)
            lineTo(10.524f, 22.585f)
            curveTo(10.077f, 22.849f, 9.556f, 23f, 9f, 23f)
            horizontalLineTo(4f)
            close()
            moveTo(9f, 16f)
            curveTo(8.448f, 16f, 8f, 15.552f, 8f, 15f)
            curveTo(8f, 14.448f, 8.448f, 14f, 9f, 14f)
            curveTo(9.552f, 14f, 10f, 14.448f, 10f, 15f)
            curveTo(10f, 15.552f, 9.552f, 16f, 9f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ResizeImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ResizeImage, contentDescription = null)
    }
}
