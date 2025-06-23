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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.AppStore: ImageVector
    get() {
        if (_AppStore != null) {
            return _AppStore!!
        }
        _AppStore = ImageVector.Builder(
            name = "Filled.AppStore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(9.369f, 15.254f)
                horizontalLineTo(7.631f)
                lineTo(7.564f, 15.37f)
                lineTo(7.519f, 15.461f)
                curveTo(7.377f, 15.802f, 7.506f, 16.204f, 7.833f, 16.396f)
                curveTo(8.161f, 16.587f, 8.575f, 16.502f, 8.802f, 16.211f)
                lineTo(8.859f, 16.126f)
                lineTo(9.369f, 15.254f)
                close()
                moveTo(13.293f, 10.024f)
                lineTo(12.422f, 11.516f)
                lineTo(15.08f, 16.124f)
                lineTo(15.136f, 16.208f)
                curveTo(15.362f, 16.501f, 15.775f, 16.588f, 16.104f, 16.399f)
                curveTo(16.433f, 16.209f, 16.564f, 15.808f, 16.424f, 15.466f)
                lineTo(16.379f, 15.374f)
                lineTo(15.877f, 14.504f)
                lineTo(16.752f, 14.505f)
                lineTo(16.854f, 14.498f)
                curveTo(17.187f, 14.453f, 17.45f, 14.189f, 17.495f, 13.857f)
                lineTo(17.502f, 13.755f)
                lineTo(17.495f, 13.653f)
                curveTo(17.45f, 13.32f, 17.187f, 13.057f, 16.854f, 13.012f)
                lineTo(16.752f, 13.005f)
                lineTo(15.012f, 13.004f)
                lineTo(13.293f, 10.024f)
                close()
                moveTo(13.263f, 7.101f)
                curveTo(12.935f, 6.91f, 12.522f, 6.995f, 12.295f, 7.286f)
                lineTo(12.237f, 7.371f)
                lineTo(11.997f, 7.78f)
                lineTo(11.763f, 7.374f)
                lineTo(11.707f, 7.29f)
                curveTo(11.503f, 7.026f, 11.149f, 6.929f, 10.84f, 7.051f)
                lineTo(10.739f, 7.099f)
                lineTo(10.654f, 7.156f)
                curveTo(10.391f, 7.36f, 10.294f, 7.714f, 10.415f, 8.023f)
                lineTo(10.464f, 8.124f)
                lineTo(11.127f, 9.271f)
                lineTo(8.946f, 13.005f)
                lineTo(7.252f, 13.005f)
                lineTo(7.15f, 13.012f)
                curveTo(6.784f, 13.061f, 6.502f, 13.375f, 6.502f, 13.755f)
                curveTo(6.502f, 14.135f, 6.784f, 14.448f, 7.15f, 14.498f)
                lineTo(7.252f, 14.505f)
                lineTo(13.279f, 14.505f)
                lineTo(12.414f, 13.005f)
                lineTo(10.683f, 13.004f)
                lineTo(13.532f, 8.127f)
                lineTo(13.578f, 8.036f)
                curveTo(13.72f, 7.695f, 13.591f, 7.293f, 13.263f, 7.101f)
                close()
            }
        }.build()

        return _AppStore!!
    }

@Suppress("ObjectPropertyName")
private var _AppStore: ImageVector? = null

@Preview
@Composable
private fun AppStorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AppStore, contentDescription = null)
    }
}
