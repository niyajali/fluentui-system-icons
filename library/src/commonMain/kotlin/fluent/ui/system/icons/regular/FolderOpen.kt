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

public val FluentUi.Regular.FolderOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 6.25f)
            curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 4.5f, 8.519f, 4.579f, 8.659f, 4.72f)
            lineTo(10.72f, 6.78f)
            curveTo(10.861f, 6.921f, 11.051f, 7f, 11.25f, 7f)
            horizontalLineTo(16.75f)
            curveTo(17.717f, 7f, 18.5f, 7.784f, 18.5f, 8.75f)
            curveTo(18.5f, 8.836f, 18.515f, 8.919f, 18.541f, 8.996f)
            lineTo(8.719f, 8.996f)
            curveTo(7.379f, 8.996f, 6.141f, 9.71f, 5.471f, 10.871f)
            lineTo(3.5f, 14.284f)
            verticalLineTo(6.25f)
            close()
            moveTo(2f, 17.788f)
            curveTo(2.021f, 19.566f, 3.468f, 21f, 5.25f, 21f)
            horizontalLineTo(11f)
            curveTo(11.029f, 21f, 11.058f, 20.998f, 11.086f, 20.995f)
            horizontalLineTo(16.281f)
            curveTo(17.621f, 20.995f, 18.859f, 20.28f, 19.529f, 19.12f)
            lineTo(22.56f, 13.871f)
            curveTo(23.775f, 11.766f, 22.334f, 9.15f, 19.957f, 9.002f)
            curveTo(19.985f, 8.923f, 20f, 8.838f, 20f, 8.75f)
            curveTo(20f, 6.955f, 18.545f, 5.5f, 16.75f, 5.5f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.726f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(17.71f)
            curveTo(2f, 17.736f, 2f, 17.762f, 2f, 17.788f)
            close()
            moveTo(8.719f, 10.496f)
            lineTo(19.745f, 10.496f)
            curveTo(21.092f, 10.496f, 21.934f, 11.954f, 21.26f, 13.121f)
            lineTo(18.23f, 18.37f)
            curveTo(17.828f, 19.066f, 17.085f, 19.495f, 16.281f, 19.495f)
            horizontalLineTo(5.255f)
            curveTo(3.908f, 19.495f, 3.066f, 18.037f, 3.739f, 16.87f)
            lineTo(6.77f, 11.621f)
            curveTo(7.172f, 10.925f, 7.915f, 10.496f, 8.719f, 10.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FolderOpen, contentDescription = null)
    }
}
