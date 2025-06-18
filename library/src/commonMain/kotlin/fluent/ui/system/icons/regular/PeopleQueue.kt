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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PeopleQueue: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleQueue",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 9f)
            curveTo(9.157f, 9f, 10.5f, 7.657f, 10.5f, 6f)
            curveTo(10.5f, 4.343f, 9.157f, 3f, 7.5f, 3f)
            curveTo(5.843f, 3f, 4.5f, 4.343f, 4.5f, 6f)
            curveTo(4.5f, 7.657f, 5.843f, 9f, 7.5f, 9f)
            close()
            moveTo(7.5f, 7.5f)
            curveTo(6.672f, 7.5f, 6f, 6.828f, 6f, 6f)
            curveTo(6f, 5.172f, 6.672f, 4.5f, 7.5f, 4.5f)
            curveTo(8.328f, 4.5f, 9f, 5.172f, 9f, 6f)
            curveTo(9f, 6.828f, 8.328f, 7.5f, 7.5f, 7.5f)
            close()
            moveTo(3f, 11.75f)
            curveTo(3f, 10.783f, 3.783f, 10f, 4.75f, 10f)
            horizontalLineTo(10.25f)
            curveTo(11.217f, 10f, 12f, 10.783f, 12f, 11.75f)
            verticalLineTo(16.5f)
            curveTo(12f, 18.985f, 9.985f, 21f, 7.5f, 21f)
            curveTo(5.015f, 21f, 3f, 18.985f, 3f, 16.5f)
            verticalLineTo(11.75f)
            close()
            moveTo(4.75f, 11.5f)
            curveTo(4.612f, 11.5f, 4.5f, 11.612f, 4.5f, 11.75f)
            verticalLineTo(16.5f)
            curveTo(4.5f, 18.157f, 5.843f, 19.5f, 7.5f, 19.5f)
            curveTo(9.157f, 19.5f, 10.5f, 18.157f, 10.5f, 16.5f)
            verticalLineTo(11.75f)
            curveTo(10.5f, 11.612f, 10.388f, 11.5f, 10.25f, 11.5f)
            horizontalLineTo(4.75f)
            close()
            moveTo(10.527f, 8.614f)
            curveTo(10.962f, 8.86f, 11.465f, 9f, 12f, 9f)
            curveTo(13.657f, 9f, 15f, 7.657f, 15f, 6f)
            curveTo(15f, 4.343f, 13.657f, 3f, 12f, 3f)
            curveTo(11.465f, 3f, 10.962f, 3.14f, 10.527f, 3.386f)
            curveTo(10.854f, 3.763f, 11.111f, 4.203f, 11.278f, 4.685f)
            curveTo(11.493f, 4.567f, 11.738f, 4.5f, 12f, 4.5f)
            curveTo(12.828f, 4.5f, 13.5f, 5.172f, 13.5f, 6f)
            curveTo(13.5f, 6.828f, 12.828f, 7.5f, 12f, 7.5f)
            curveTo(11.738f, 7.5f, 11.493f, 7.433f, 11.278f, 7.315f)
            curveTo(11.111f, 7.797f, 10.854f, 8.237f, 10.527f, 8.614f)
            close()
            moveTo(10.86f, 20.854f)
            curveTo(11.224f, 20.949f, 11.606f, 21f, 12f, 21f)
            curveTo(14.485f, 21f, 16.5f, 18.985f, 16.5f, 16.5f)
            verticalLineTo(11.75f)
            curveTo(16.5f, 10.783f, 15.716f, 10f, 14.75f, 10f)
            horizontalLineTo(12.371f)
            curveTo(12.714f, 10.415f, 12.938f, 10.933f, 12.989f, 11.5f)
            horizontalLineTo(14.75f)
            curveTo(14.888f, 11.5f, 15f, 11.612f, 15f, 11.75f)
            verticalLineTo(16.5f)
            curveTo(15f, 18.119f, 13.717f, 19.439f, 12.112f, 19.498f)
            curveTo(11.773f, 20.017f, 11.349f, 20.476f, 10.86f, 20.854f)
            close()
            moveTo(15.027f, 8.614f)
            curveTo(15.462f, 8.86f, 15.965f, 9f, 16.5f, 9f)
            curveTo(18.157f, 9f, 19.5f, 7.657f, 19.5f, 6f)
            curveTo(19.5f, 4.343f, 18.157f, 3f, 16.5f, 3f)
            curveTo(15.965f, 3f, 15.462f, 3.14f, 15.027f, 3.386f)
            curveTo(15.354f, 3.763f, 15.611f, 4.203f, 15.778f, 4.685f)
            curveTo(15.993f, 4.567f, 16.238f, 4.5f, 16.5f, 4.5f)
            curveTo(17.328f, 4.5f, 18f, 5.172f, 18f, 6f)
            curveTo(18f, 6.828f, 17.328f, 7.5f, 16.5f, 7.5f)
            curveTo(16.238f, 7.5f, 15.993f, 7.433f, 15.778f, 7.315f)
            curveTo(15.611f, 7.797f, 15.354f, 8.237f, 15.027f, 8.614f)
            close()
            moveTo(15.36f, 20.854f)
            curveTo(15.724f, 20.949f, 16.106f, 21f, 16.5f, 21f)
            curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
            verticalLineTo(11.75f)
            curveTo(21f, 10.783f, 20.216f, 10f, 19.25f, 10f)
            horizontalLineTo(16.871f)
            curveTo(17.214f, 10.415f, 17.438f, 10.933f, 17.489f, 11.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 11.5f, 19.5f, 11.612f, 19.5f, 11.75f)
            verticalLineTo(16.5f)
            curveTo(19.5f, 18.119f, 18.217f, 19.439f, 16.612f, 19.498f)
            curveTo(16.273f, 20.017f, 15.849f, 20.476f, 15.36f, 20.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleQueuePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PeopleQueue, contentDescription = null)
    }
}
