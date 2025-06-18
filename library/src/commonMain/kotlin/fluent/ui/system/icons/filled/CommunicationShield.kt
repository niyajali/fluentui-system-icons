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

public val FluentIcons.Filled.CommunicationShield: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommunicationShield",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4f)
            curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
            curveTo(4f, 14.207f, 4.892f, 16.203f, 6.338f, 17.652f)
            curveTo(6.728f, 18.042f, 6.728f, 18.676f, 6.337f, 19.066f)
            curveTo(5.946f, 19.456f, 5.313f, 19.455f, 4.922f, 19.065f)
            curveTo(3.118f, 17.257f, 2f, 14.758f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 12.324f, 21.985f, 12.645f, 21.954f, 12.961f)
            curveTo(21.154f, 12.7f, 20.466f, 12.194f, 19.997f, 11.777f)
            curveTo(19.879f, 7.462f, 16.344f, 4f, 12f, 4f)
            close()
            moveTo(17.3f, 11.487f)
            curveTo(17.483f, 11.305f, 17.7f, 11.174f, 17.932f, 11.094f)
            curveTo(17.495f, 8.21f, 15.006f, 6f, 12f, 6f)
            curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
            curveTo(6f, 13.657f, 6.673f, 15.158f, 7.757f, 16.243f)
            curveTo(8.148f, 16.633f, 8.781f, 16.633f, 9.172f, 16.243f)
            curveTo(9.562f, 15.852f, 9.562f, 15.219f, 9.172f, 14.828f)
            curveTo(8.447f, 14.104f, 8f, 13.105f, 8f, 12f)
            curveTo(8f, 9.791f, 9.791f, 8f, 12f, 8f)
            curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
            curveTo(16f, 12.181f, 15.988f, 12.359f, 15.965f, 12.534f)
            curveTo(16.539f, 12.195f, 17.005f, 11.782f, 17.3f, 11.487f)
            close()
            moveTo(12f, 10f)
            curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
            curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
            curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
            curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
            close()
            moveTo(18.99f, 12.194f)
            curveTo(19.642f, 12.845f, 20.896f, 13.88f, 22.439f, 14.093f)
            curveTo(22.747f, 14.135f, 23f, 14.378f, 23f, 14.682f)
            verticalLineTo(17.52f)
            curveTo(23f, 21.336f, 19.421f, 22.721f, 18.647f, 22.976f)
            curveTo(18.55f, 23.008f, 18.451f, 23.008f, 18.354f, 22.976f)
            curveTo(17.58f, 22.721f, 14f, 21.336f, 14f, 17.52f)
            lineTo(14f, 14.682f)
            curveTo(14f, 14.378f, 14.253f, 14.135f, 14.561f, 14.093f)
            curveTo(16.103f, 13.88f, 17.358f, 12.845f, 18.01f, 12.194f)
            curveTo(18.27f, 11.935f, 18.729f, 11.935f, 18.99f, 12.194f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommunicationShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommunicationShield, contentDescription = null)
    }
}
