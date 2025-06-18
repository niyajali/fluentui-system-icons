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

public val FluentIcons.Filled.AnimalCat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AnimalCat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.247f, 22f)
            lineTo(7.236f, 22f)
            horizontalLineTo(5.796f)
            curveTo(3.7f, 22f, 2f, 20.299f, 2f, 18.202f)
            curveTo(2f, 17.24f, 2.365f, 16.313f, 3.021f, 15.61f)
            lineTo(4.156f, 14.393f)
            curveTo(4.92f, 13.574f, 5.175f, 12.403f, 4.821f, 11.34f)
            curveTo(4.671f, 10.889f, 4.418f, 10.48f, 4.083f, 10.145f)
            lineTo(2.969f, 9.03f)
            curveTo(2.676f, 8.737f, 2.676f, 8.263f, 2.969f, 7.97f)
            curveTo(3.262f, 7.677f, 3.736f, 7.677f, 4.029f, 7.97f)
            lineTo(5.143f, 9.084f)
            curveTo(5.643f, 9.584f, 6.02f, 10.194f, 6.243f, 10.866f)
            curveTo(6.771f, 12.45f, 6.391f, 14.196f, 5.252f, 15.416f)
            lineTo(4.117f, 16.633f)
            curveTo(3.72f, 17.059f, 3.499f, 17.619f, 3.499f, 18.202f)
            curveTo(3.499f, 19.471f, 4.528f, 20.5f, 5.796f, 20.5f)
            horizontalLineTo(6.474f)
            curveTo(6.471f, 20.215f, 6.473f, 19.865f, 6.486f, 19.467f)
            curveTo(6.522f, 18.384f, 6.643f, 16.925f, 6.986f, 15.455f)
            curveTo(7.326f, 13.993f, 7.901f, 12.459f, 8.885f, 11.278f)
            curveTo(9.757f, 10.231f, 10.94f, 9.477f, 12.494f, 9.293f)
            verticalLineTo(5.15f)
            curveTo(12.494f, 3.41f, 13.904f, 2f, 15.642f, 2f)
            curveTo(16.388f, 2f, 16.992f, 2.604f, 16.992f, 3.35f)
            verticalLineTo(4f)
            horizontalLineTo(18.628f)
            curveTo(19.579f, 4f, 20.462f, 4.492f, 20.963f, 5.301f)
            lineTo(21.583f, 6.301f)
            curveTo(22.675f, 8.063f, 21.499f, 10.32f, 19.49f, 10.49f)
            verticalLineTo(19.75f)
            curveTo(19.49f, 20.993f, 18.483f, 22f, 17.242f, 22f)
            lineTo(16.492f, 22f)
            verticalLineTo(19.75f)
            curveTo(16.492f, 17.679f, 14.814f, 16f, 12.744f, 16f)
            horizontalLineTo(11.495f)
            curveTo(11.081f, 16f, 10.745f, 16.336f, 10.745f, 16.75f)
            curveTo(10.745f, 17.164f, 11.081f, 17.5f, 11.495f, 17.5f)
            horizontalLineTo(12.744f)
            curveTo(13.986f, 17.5f, 14.993f, 18.507f, 14.993f, 19.75f)
            verticalLineTo(22f)
            lineTo(7.247f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AnimalCatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AnimalCat, contentDescription = null)
    }
}
