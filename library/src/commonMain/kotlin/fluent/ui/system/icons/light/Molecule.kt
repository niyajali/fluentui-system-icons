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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Molecule: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Molecule",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 16f)
            curveTo(25.866f, 16f, 29f, 12.866f, 29f, 9f)
            curveTo(29f, 5.134f, 25.866f, 2f, 22f, 2f)
            curveTo(18.134f, 2f, 15f, 5.134f, 15f, 9f)
            curveTo(15f, 10.188f, 15.296f, 11.306f, 15.818f, 12.286f)
            lineTo(13.063f, 14.429f)
            curveTo(12.075f, 12.964f, 10.4f, 12f, 8.5f, 12f)
            curveTo(5.462f, 12f, 3f, 14.462f, 3f, 17.5f)
            curveTo(3f, 20.538f, 5.462f, 23f, 8.5f, 23f)
            curveTo(10.295f, 23f, 11.89f, 22.14f, 12.894f, 20.809f)
            lineTo(17.477f, 23.482f)
            curveTo(17.172f, 24.089f, 17f, 24.774f, 17f, 25.5f)
            curveTo(17f, 27.985f, 19.015f, 30f, 21.5f, 30f)
            curveTo(23.985f, 30f, 26f, 27.985f, 26f, 25.5f)
            curveTo(26f, 23.015f, 23.985f, 21f, 21.5f, 21f)
            curveTo(20.1f, 21f, 18.848f, 21.64f, 18.023f, 22.643f)
            lineTo(13.421f, 19.958f)
            curveTo(13.792f, 19.219f, 14f, 18.384f, 14f, 17.5f)
            curveTo(14f, 16.724f, 13.839f, 15.986f, 13.55f, 15.317f)
            lineTo(16.353f, 13.137f)
            curveTo(17.627f, 14.873f, 19.682f, 16f, 22f, 16f)
            close()
            moveTo(22f, 15f)
            curveTo(18.686f, 15f, 16f, 12.314f, 16f, 9f)
            curveTo(16f, 5.686f, 18.686f, 3f, 22f, 3f)
            curveTo(25.314f, 3f, 28f, 5.686f, 28f, 9f)
            curveTo(28f, 12.314f, 25.314f, 15f, 22f, 15f)
            close()
            moveTo(8.5f, 22f)
            curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
            curveTo(4f, 15.015f, 6.015f, 13f, 8.5f, 13f)
            curveTo(10.985f, 13f, 13f, 15.015f, 13f, 17.5f)
            curveTo(13f, 19.985f, 10.985f, 22f, 8.5f, 22f)
            close()
            moveTo(25f, 25.5f)
            curveTo(25f, 27.433f, 23.433f, 29f, 21.5f, 29f)
            curveTo(19.567f, 29f, 18f, 27.433f, 18f, 25.5f)
            curveTo(18f, 23.567f, 19.567f, 22f, 21.5f, 22f)
            curveTo(23.433f, 22f, 25f, 23.567f, 25f, 25.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoleculePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Molecule, contentDescription = null)
    }
}
