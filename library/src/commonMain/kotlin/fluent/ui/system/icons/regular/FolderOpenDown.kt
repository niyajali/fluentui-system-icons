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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.FolderOpenDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderOpenDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 17.75f)
            curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 19.5f, 8.519f, 19.421f, 8.659f, 19.28f)
            lineTo(10.72f, 17.22f)
            curveTo(10.861f, 17.079f, 11.051f, 17f, 11.25f, 17f)
            horizontalLineTo(16.75f)
            curveTo(17.717f, 17f, 18.5f, 16.216f, 18.5f, 15.25f)
            curveTo(18.5f, 15.164f, 18.515f, 15.081f, 18.541f, 15.004f)
            lineTo(8.719f, 15.004f)
            curveTo(7.379f, 15.004f, 6.141f, 14.29f, 5.471f, 13.129f)
            lineTo(3.5f, 9.716f)
            verticalLineTo(17.75f)
            close()
            moveTo(2f, 6.212f)
            curveTo(2.021f, 4.434f, 3.468f, 3f, 5.25f, 3f)
            horizontalLineTo(11f)
            curveTo(11.029f, 3f, 11.058f, 3.002f, 11.086f, 3.005f)
            horizontalLineTo(16.281f)
            curveTo(17.621f, 3.005f, 18.859f, 3.72f, 19.529f, 4.88f)
            lineTo(22.56f, 10.129f)
            curveTo(23.775f, 12.234f, 22.334f, 14.85f, 19.957f, 14.998f)
            curveTo(19.985f, 15.077f, 20f, 15.161f, 20f, 15.25f)
            curveTo(20f, 17.045f, 18.545f, 18.5f, 16.75f, 18.5f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 20.341f)
            curveTo(9.298f, 20.763f, 8.726f, 21f, 8.129f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.29f)
            curveTo(2f, 6.264f, 2f, 6.238f, 2f, 6.212f)
            close()
            moveTo(8.719f, 13.504f)
            lineTo(19.745f, 13.504f)
            curveTo(21.092f, 13.504f, 21.934f, 12.046f, 21.26f, 10.879f)
            lineTo(18.23f, 5.63f)
            curveTo(17.828f, 4.934f, 17.085f, 4.505f, 16.281f, 4.505f)
            horizontalLineTo(5.255f)
            curveTo(3.908f, 4.505f, 3.066f, 5.963f, 3.739f, 7.13f)
            lineTo(6.77f, 12.379f)
            curveTo(7.172f, 13.075f, 7.915f, 13.504f, 8.719f, 13.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderOpenDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderOpenDown, contentDescription = null)
    }
}
